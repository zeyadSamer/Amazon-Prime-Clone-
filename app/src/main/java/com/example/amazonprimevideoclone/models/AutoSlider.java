package com.example.amazonprimevideoclone.models;

import android.app.Activity;

import androidx.viewpager.widget.ViewPager;


import java.util.List;
import java.util.TimerTask;

public class AutoSlider extends TimerTask {

    List<BannerMovie> bannerMovieList;
    ViewPager bannerViewPager;
    Activity currentActivity;


    public AutoSlider(List<BannerMovie> bannerMovieList, ViewPager bannerMovieViewPager, Activity activity) {
        this.bannerMovieList = bannerMovieList;
        this.bannerViewPager = bannerMovieViewPager;

        this.currentActivity=activity;
    }




    @Override
    public void run() {
        currentActivity.runOnUiThread(new Runnable() {

            @Override
            public void run() {
//                if(bannerViewPager.getCurrentItem() < bannerMovieList.size()-1){
//
//                    bannerViewPager.setCurrentItem(bannerViewPager.getCurrentItem()+1);
//
//
//
//
//
//                }else{
//                    bannerViewPager.setCurrentItem(0);
//
//
//
//                }
                int index=bannerViewPager.getCurrentItem()+1;

                bannerViewPager.setCurrentItem(index % bannerMovieList.size());



            }
        });



    }
}
