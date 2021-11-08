package com.example.recipes;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class RecipeListAdapter extends RecyclerView.Adapter<RecipeListAdapter.RecipeViewHolder>{
    private final LinkedList<Recipe> mRecipeList;
    private LayoutInflater mInflater;
    private Context context;


    public RecipeListAdapter(Context context,LinkedList<Recipe> recipeList){
            mInflater=LayoutInflater.from(context);
            this.mRecipeList=recipeList;
            this.context=context;
    }


        @NonNull
        @Override
        public RecipeViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
                View mItemView=mInflater.inflate(R.layout.recipe_item,parent,false);
                return new RecipeViewHolder(mItemView,this);
                }

        @Override
        public void onBindViewHolder(RecipeViewHolder holder,int position){
                Recipe mCurrent=mRecipeList.get(position);
                holder.recipeItem1View.setText(mCurrent.getNom());
                holder.recipeItem2View.setText(mCurrent.getDes());
                holder.ll.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(context,Detail.class);
                        context.startActivity(intent);
                    }
                });

                }
        @Override
        public int getItemCount(){
                return mRecipeList.size();
                }

        class RecipeViewHolder extends RecyclerView.ViewHolder {
            public final TextView recipeItem1View;
            public final TextView recipeItem2View;
            public final LinearLayout ll;

            final RecipeListAdapter mAdapter;

            RecipeViewHolder(View itemView, RecipeListAdapter adapter) {
                super(itemView);
                recipeItem1View = itemView.findViewById(R.id.recipe);
                recipeItem2View = itemView.findViewById(R.id.description);
                ll=itemView.findViewById(R.id.ll);
                this.mAdapter = adapter;
            }

        }
    }
