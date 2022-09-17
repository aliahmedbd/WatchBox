package com.verygroup.watchbox.di

import com.verygroup.watchbox.network.NetworkModule
import com.verygroup.watchbox.repository.MovieRepository
import com.verygroup.watchbox.viewmodel.MovieViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val appModule = module {
    single(named("data_repo")) { MovieRepository(NetworkModule(androidContext())) }
    viewModel { MovieViewModel(get(named("data_repo"))) }
    single(named("context")) { androidContext() }
}