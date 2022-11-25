package com.example.amazonprimevideoclone.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.amazonprimevideoclone.R;
import com.example.amazonprimevideoclone.models.CategoryMovie;

import java.util.List;


class CategoryMoviesRecyclerAdapter extends RecyclerView.Adapter<CategoryMoviesRecyclerAdapter.CategoryMovieViewHolder> {

    Context context;
    List<CategoryMovie> categoryMovieList;

    public CategoryMoviesRecyclerAdapter(Context context,List<CategoryMovie> categoryMovieList){
        this.context=context;
        this.categoryMovieList=categoryMovieList;



    }




    public static  class CategoryMovieViewHolder extends RecyclerView.ViewHolder{

        ImageView categoryMovieImage;



        public CategoryMovieViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryMovieImage= itemView.findViewById(R.id.movie_image);

        }
    }






    @NonNull
    @Override
    public CategoryMovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View categoryMovieView= LayoutInflater.from(context).inflate(R.layout.cat_recycler_row_movies,parent,false);

         return new CategoryMovieViewHolder(categoryMovieView);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryMoviesRecyclerAdapter.CategoryMovieViewHolder holder, int position) {
        //pass the image into the category movie image view
        Glide.with(context).load(categoryMovieList.get(position).getImageUrl()).into(holder.categoryMovieImage);



    }


    @Override
    public int getItemCount() {
        return categoryMovieList.size();
    }
}
