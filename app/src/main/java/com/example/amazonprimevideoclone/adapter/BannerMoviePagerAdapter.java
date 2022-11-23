package com.example.amazonprimevideoclone.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.example.amazonprimevideoclone.MainActivity;
import com.example.amazonprimevideoclone.R;
import com.example.amazonprimevideoclone.models.BannerMovie;

import java.util.List;

public class BannerMoviePagerAdapter extends PagerAdapter {

//implements the abstract class PagerAdapter
    Context context;
    List<BannerMovie> bannerMoviesList;

    public BannerMoviePagerAdapter(Context context, List<BannerMovie> bannerMovieList) {


        this.context=context;
        this.bannerMoviesList=bannerMovieList;
    }


    @Override
    public int getCount() {
        return bannerMoviesList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {


        return view==object;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        //remove the view from given container
        container.removeView((View) object);
        //container.removeViewAt(position);
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater = LayoutInflater.from(context);
        //inflater creates another copy of our custom layout which is banner movie layout in this case
        View view=inflater.inflate(R.layout.banner_movie_layout,null);
        //at this point view variable has all features of banner_movie_layout
        //get the reference of the image placeholeder
        ImageView bannerImage=view.findViewById(R.id.banner_image);
        //add our image into that place holder using glide library
       Glide.with(context).load(bannerMoviesList.get(position).getImageUrl()).into(bannerImage);

       //add that newly created view into the parent container
       container.addView(view);

       return view;
    }
}
