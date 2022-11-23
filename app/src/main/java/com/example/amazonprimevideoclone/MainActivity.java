package com.example.amazonprimevideoclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.amazonprimevideoclone.adapter.BannerMoviePagerAdapter;
import com.example.amazonprimevideoclone.models.BannerMovie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    List<BannerMovie> bannerMovieList;
    BannerMoviePagerAdapter bannerMoviePagerAdapter;
    ViewPager bannerViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bannerMovieList=new ArrayList<>();
        bannerMovieList.add(new BannerMovie(1,"Sherlock","https://s.yimg.com/ny/api/res/1.2/UlMGVyFU7e.RUQF86PNX4g--/YXBwaWQ9aGlnaGxhbmRlcjt3PTY0MA--/https://s.yimg.com/os/creatr-uploaded-images/2022-08/05b9c7c0-27a2-11ed-addb-30f92bddd438",
                " "));


        bannerMovieList.add(new BannerMovie(2,"Passion","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQnb2beeUuWNBYzkGqkQWCsagP9QSRVa9iDdo0UUCnDM5qZa3wR-JGSmDf7lCbHbiD8Mts&usqp=CAU",
                " "));



        setBannerMoviePagerAdapter(bannerMovieList);


    }


    private void setBannerMoviePagerAdapter(List<BannerMovie> bannerMovieList){


     bannerMoviePagerAdapter=new BannerMoviePagerAdapter(this,bannerMovieList);

     bannerViewPager=findViewById(R.id.banner_viewPager);

     bannerViewPager.setAdapter(bannerMoviePagerAdapter);






    }



}