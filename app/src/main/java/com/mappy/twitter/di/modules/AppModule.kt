package com.mappy.twitter.di.modules

import android.content.Context
import android.content.res.Resources
import com.mappy.twitter.BuildConfig
import com.mappy.twitter.repository.api.ApiService
import dagger.Module
import dagger.Provides
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * Created by Asif Kazmi.
 */
@Module(includes = [com.mappy.twitter.di.modules.ActivityModule::class, com.mappy.twitter.di.modules.ViewModelModule::class])
class AppModule {


    /**
     * Static variables to hold base url's etc.
     */
    companion object {
        private const val BASE_URL = BuildConfig.BASE_URL
    }


    /**
     * Provides ApiServices client for Retrofit
     */
    @Singleton
    @Provides
    fun provideService(okHttpClient: OkHttpClient): ApiService {
        return Retrofit.Builder()
            .baseUrl(com.mappy.twitter.di.modules.AppModule.Companion.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(com.mappy.twitter.repository.api.network.LiveDataCallAdapterFactoryForRetrofit())
            .client(okHttpClient)
            .build()
            .create(ApiService::class.java)
    }

    @Provides
    @Singleton
    fun getOkHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        val okHttpClient = OkHttpClient.Builder()
        okHttpClient.connectTimeout(30, TimeUnit.SECONDS)
        okHttpClient.readTimeout(30, TimeUnit.SECONDS)
        okHttpClient.writeTimeout(30, TimeUnit.SECONDS)
        okHttpClient.addInterceptor(httpLoggingInterceptor)
        return okHttpClient.build()
    }

    @Provides
    @Singleton
    fun getHttpLoggingInterceptor(): HttpLoggingInterceptor {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        return httpLoggingInterceptor
    }

    /**
     * Application application level context.
     */
    @Singleton
    @Provides
    fun provideContext(application: com.mappy.twitter.app.App): Context {
        return application.applicationContext
    }


    /**
     * Application resource provider, so that we can get the Drawable, Color, String etc at runtime
     */
    @Provides
    @Singleton
    fun providesResources(application: com.mappy.twitter.app.App): Resources = application.resources

}
