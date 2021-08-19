package com.mappy.twitter.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mappy.twitter.ui.detail.DetailViewModel
import com.mappy.twitter.ui.map.MapViewModel
import com.mappy.twitter.ui.search.SearchViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by Asif Kazmi.
 */

@Module
abstract class ViewModelModule {


    /**
     * Detail View Model
     */
    @Binds
    @IntoMap
    @com.mappy.twitter.di.base.ViewModelKey(DetailViewModel::class)
    abstract fun bindDetailViewModel(detailViewModel: DetailViewModel): ViewModel

    /**
     * Search View Model
     */
    @Binds
    @IntoMap
    @com.mappy.twitter.di.base.ViewModelKey(SearchViewModel::class)
    abstract fun bindSearchViewModel(searchViewModel: SearchViewModel): ViewModel

    /**
     * Twitter Map View Model
     */
    @Binds
    @IntoMap
    @com.mappy.twitter.di.base.ViewModelKey(MapViewModel::class)
    abstract fun bindMapViewModel(searchViewModel: MapViewModel): ViewModel

    /**
     * Binds ViewModels factory to provide ViewModels.
     */
    @Binds
    abstract fun bindViewModelFactory(factory: com.mappy.twitter.di.base.ViewModelFactory): ViewModelProvider.Factory
}
