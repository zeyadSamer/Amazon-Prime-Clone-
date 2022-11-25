package com.example.amazonprimevideoclone.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amazonprimevideoclone.R;
import com.example.amazonprimevideoclone.models.Category;
import com.example.amazonprimevideoclone.models.CategoryMovie;

import java.util.ArrayList;
import java.util.List;

public class MainRecyclerAdapter extends RecyclerView.Adapter<MainRecyclerAdapter.MainViewHolder> {

    Context context;

    List<Category> categoryList= new ArrayList<Category>();




    public MainRecyclerAdapter(Context context ,List<Category> categoryList){
        this.categoryList=categoryList;

        this.context=context;


    }



    public static class MainViewHolder extends RecyclerView.ViewHolder{

        TextView categoryText;
        RecyclerView movieRecycler;




        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryText=itemView.findViewById(R.id.category_item);
            movieRecycler=itemView.findViewById(R.id.movie_recycler);


        }
    }


    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        //remember inflater takes XML files for components as  an inputs and build the view objects from it
        View view= LayoutInflater.from(context).inflate(R.layout.main_recycler_row_item,parent,false);



        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {

        //this methods binds the data to the Viewholder as written in android documentation
        holder.categoryText.setText(categoryList.get(position).getTitle());

        // for each category deliver the category movies to the movie recycler
        setMovieRecycler( holder.movieRecycler,categoryList.get(position).getCategoryMovieList());

    }



    @Override
    public int getItemCount() {
        return categoryList.size();
    }



    private void setMovieRecycler(RecyclerView recyclerView,List<CategoryMovie> categoryMovieList){


        CategoryMoviesRecyclerAdapter categoryMoviesRecyclerAdapter=new CategoryMoviesRecyclerAdapter(context,categoryMovieList);
        recyclerView.setLayoutManager(new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false));
        recyclerView.setAdapter(categoryMoviesRecyclerAdapter);




    }















}
