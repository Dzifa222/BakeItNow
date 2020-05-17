package com.dzifa.kuvi.bakingapp.di;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.dzifa.kuvi.bakingapp.viewmodel.DetailViewModel;
import com.dzifa.kuvi.bakingapp.viewmodel.MainViewModel;
import com.dzifa.kuvi.bakingapp.viewmodel.ViewModelFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel.class)
    abstract ViewModel bindMainViewModel(MainViewModel mainViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(DetailViewModel.class)
    abstract ViewModel bindDetailViewModel(DetailViewModel detailViewModel);


    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);
}