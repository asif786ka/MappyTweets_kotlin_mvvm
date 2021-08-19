package com.mappy.twitter.di.components

import com.mappy.twitter.app.App
import com.mappy.twitter.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by Asif Kazmi.
 */

/**
 * AndroidInjectionModule::class to support Dagger
 * AppModule::class is loading all modules for app
 */
@Singleton
@Component(modules = [AndroidInjectionModule::class, com.mappy.twitter.di.modules.AppModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(app: com.mappy.twitter.app.App): com.mappy.twitter.di.components.AppComponent.Builder

        fun build(): com.mappy.twitter.di.components.AppComponent
    }

    fun inject(app: com.mappy.twitter.app.App)

}
