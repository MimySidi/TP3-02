package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecipeListAdapter mAdapter;
    private final LinkedList<Recipe> mRecipeList = new LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecipeList.add(new Recipe(getString(R.string.recipe1),getString(R.string.des1)));
        mRecipeList.add(new Recipe(getString(R.string.recipe2),getString(R.string.des2)));
        mRecipeList.add(new Recipe(getString(R.string.recipe3),getString(R.string.des3)));
        mRecipeList.add(new Recipe(getString(R.string.recipe4),getString(R.string.des4)));

        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new RecipeListAdapter(this, mRecipeList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}