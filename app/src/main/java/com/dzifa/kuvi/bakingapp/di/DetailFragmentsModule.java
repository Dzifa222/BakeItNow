package com.dzifa.kuvi.bakingapp.di;

import com.dzifa.kuvi.bakingapp.ui.SelectStepFragment;
import com.dzifa.kuvi.bakingapp.ui.ViewStepFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class DetailFragmentsModule {
    @ContributesAndroidInjector
    abstract SelectStepFragment contributeSelectStepFragment();

    @ContributesAndroidInjector
    abstract ViewStepFragment contributeViewStepFragment();
}
