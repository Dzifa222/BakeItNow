package com.dzifa.kuvi.bakingapp.api;

import android.arch.lifecycle.LiveData;

import com.dzifa.kuvi.bakingapp.model.Recipe;

import java.util.List;

import retrofit2.http.GET;

public interface WebService {
    @GET("baking.json")
    LiveData<ApiResponse<List<Recipe>>> getRecipes();
}
