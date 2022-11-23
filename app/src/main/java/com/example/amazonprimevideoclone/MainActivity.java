package com.example.amazonprimevideoclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.amazonprimevideoclone.adapter.BannerMoviePagerAdapter;
import com.example.amazonprimevideoclone.models.AutoSlider;
import com.example.amazonprimevideoclone.models.BannerMovie;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {



    List<BannerMovie>homeBannerList;
    List <BannerMovie> kidsBannerList;
    List <BannerMovie> tvShowBannerList;
    List <BannerMovie> MovieBannerList;


    BannerMoviePagerAdapter bannerMoviePagerAdapter;
    ViewPager bannerViewPager;
    TabLayout tabIndicator,categoryTab;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabIndicator=findViewById(R.id.tab_indicator);
        categoryTab =findViewById(R.id.tabLayout);

        homeBannerList=new ArrayList<>();
        homeBannerList.add(new BannerMovie(1,"Sherlock","https://m.media-amazon.com/images/M/MV5BMjIwMjE1Nzc4NV5BMl5BanBnXkFtZTgwNDg4OTA1NzM@._V1_SX1500.jpg", " "));

        homeBannerList .add(new BannerMovie(2,"Passion","https://m.media-amazon.com/images/M/MV5BMTE0YWFmOTMtYTU2ZS00ZTIxLWE3OTEtYTNiYzBkZjViZThiXkEyXkFqcGdeQXVyODMzMzQ4OTI@._V1_SX300.jpg", " "));
        homeBannerList .add(new BannerMovie(3,"Passion","https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_SY1000_CR0,0,674,1000_AL_.jpg",""));

        kidsBannerList=new ArrayList<>();
        kidsBannerList.add(new BannerMovie(1,"ugly dolls","https://m.media-amazon.com/images/M/MV5BMTc0NjE2ODM2OV5BMl5BanBnXkFtZTgwMjQyNDUzNzM@._V1_SX300.jpg", " "));

        kidsBannerList .add(new BannerMovie(2,"Dora and the Lost City of Gold","https://m.media-amazon.com/images/M/MV5BMjIwMjE1Nzc4NV5BMl5BanBnXkFtZTgwNDg4OTA1NzM@._V1_SX300.jpg", " "));

        MovieBannerList=new ArrayList<>();

        MovieBannerList.add(new BannerMovie(3,"Stranger things","https://m.media-amazon.com/images/M/MV5BMTk3NTc2NTI0N15BMl5BanBnXkFtZTgwMDA4MjcwNzM@._V1_SX300.jpg",""));
        MovieBannerList.add(new BannerMovie(3,"Hell boy","https://m.media-amazon.com/images/M/MV5BYTMyYjg0MTItYTcyZS00MmRiLWIxNWQtYTRiZjRkYWMxZGNkXkEyXkFqcGdeQXVyNjg2NjQwMDQ@._V1_SX300.jpg",""));

        tvShowBannerList=new ArrayList<>();


        tvShowBannerList.add(new BannerMovie(3,"Triple Threat","https://m.media-amazon.com/images/M/MV5BYTY1MjRhYmYtZDg4Yy00ZWRiLWIwYzktZThkY2E0YjZlNjgxXkEyXkFqcGdeQXVyMTc3MjY3NTY@._V1_SX300.jpg",""));
        tvShowBannerList.add(new BannerMovie(3,"US","https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_SY1000_CR0,0,674,1000_AL_.jpg",""));



        setBannerMoviePagerAdapter(homeBannerList);



        categoryTab.addOnTabSelectedListener(

                new TabLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {

                        if(tab.getText().equals("HOME")){
                           setBannerMoviePagerAdapter(homeBannerList);
                        }else if(tab.getText().equals("TV SHOWS")){

                           setBannerMoviePagerAdapter(tvShowBannerList);
                        }else if(tab.getText().equals("KIDS")){

                          setBannerMoviePagerAdapter(kidsBannerList);
                        }else if(tab.getText().equals("MOVIES")){
                           setBannerMoviePagerAdapter(MovieBannerList);

                        }

                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {

                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {

                    }
                }

        );


    }







    private void setBannerMoviePagerAdapter(List<BannerMovie> bannerMovieList){







     bannerMoviePagerAdapter=new BannerMoviePagerAdapter(this,bannerMovieList);
     bannerViewPager=findViewById(R.id.banner_viewPager);
     bannerViewPager.setAdapter(bannerMoviePagerAdapter);
     AutoSlider bannerSliderTask=new AutoSlider(bannerMovieList,bannerViewPager, (Activity)this);
     Timer sliderTimer =new Timer();
     sliderTimer.scheduleAtFixedRate(bannerSliderTask,4000,6000);
     //this makes the tab (three dots on the image) in sync with the banners changing
     tabIndicator.setupWithViewPager(bannerViewPager,true);

    }




}