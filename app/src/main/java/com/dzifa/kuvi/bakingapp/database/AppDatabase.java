package com.dzifa.kuvi.bakingapp.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.dzifa.kuvi.bakingapp.model.Ingredient;
import com.dzifa.kuvi.bakingapp.model.Recipe;
import com.dzifa.kuvi.bakingapp.model.Step;

@Database(entities = {Recipe.class, Ingredient.class, Step.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    abstract public RecipeDao recipeDao();
}
