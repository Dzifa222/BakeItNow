package com.dzifa.kuvi.bakingapp.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.dzifa.kuvi.bakingapp.model.Recipe;
import com.dzifa.kuvi.bakingapp.repository.Repository;
import com.dzifa.kuvi.bakingapp.repository.Resource;

import java.util.List;

import javax.inject.Inject;

public class MainViewModel extends ViewModel {
    private LiveData<Resource<List<Recipe>>> recipes;
    private final Repository repository;

    @Inject
    public MainViewModel(Repository repository) {
        this.repository = repository;
    }

    public LiveData<Resource<List<Recipe>>> getRecipes() {
        if (recipes == null) {
            recipes = repository.loadRecipes();
        }

        return recipes;
    }
}
