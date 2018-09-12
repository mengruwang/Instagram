package com.mengrudaddy.instagram.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.mengrudaddy.instagram.ActivityFeed;
import com.mengrudaddy.instagram.Album;
import com.mengrudaddy.instagram.MainActivity;
import com.mengrudaddy.instagram.Photo;
import com.mengrudaddy.instagram.ProfileActivity;
import com.mengrudaddy.instagram.R;
import com.mengrudaddy.instagram.SearchActivity;
import com.mengrudaddy.instagram.Video;

/*
 Created by mengru
 Bottom Naviga helper
 */
public class BottomSwitchHelper {
    private static final String TAG = "BottomNavigHelper";

    public static void setUp(BottomNavigationViewEx bottomNavigationViewEx) {
        Log.d(TAG, "BottomSwitchHelper: "+bottomNavigationViewEx);
        //bottomNavigationViewEx.enableAnimation(true);
        //bottomNavigationViewEx.enableItemShiftingMode(false);
        //bottomNavigationViewEx.enableShiftingMode(false);
        //bottomNavigationViewEx.setTextVisibility(false);

    }
    public static void SwitchEnable(final Context context, BottomNavigationViewEx btViewEx){
        btViewEx.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id=menuItem.getItemId();
                switch (id){
                    case R.id.action_local:
                            Intent album = new Intent(context,Album.class);
                        album.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        ((Activity)context).finish();
                        context.startActivity(album);
                        //Log.d(TAG, "onNavigationItemSelected: "+context);
                        ((Activity)context).overridePendingTransition(R.anim.slide_left, R.anim.slide_right);
                        break;
                    case R.id.action_photo:
                        Intent photo = new Intent(context,Photo.class);
                        photo.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        ((Activity)context).finish();
                        context.startActivity(photo);
                        //Log.d(TAG, "********************** "+context.getClass().getName().equals("com.mengrudaddy.instagram.Video"));
                        if (context.getClass().getName().equals("com.mengrudaddy.instagram.Video"))
                            ((Activity)context).overridePendingTransition(R.anim.slide_left, R.anim.slide_right);
                        if (context.getClass().getName().equals("com.mengrudaddy.instagram.Album"))
                            ((Activity)context).overridePendingTransition(R.anim.slide_right1, R.anim.slide_left1);

                        break;
                    case R.id.action_video:
                        Intent video = new Intent(context, Video.class);
                        video.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        ((Activity)context).finish();
                        context.startActivity(video);
                        ((Activity)context).overridePendingTransition(R.anim.slide_right1, R.anim.slide_left1);
                        break;


                }
                return true;
            }
        });

    }

}
