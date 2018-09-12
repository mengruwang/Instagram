package com.mengrudaddy.instagram;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.mengrudaddy.instagram.utils.BottomNavigHelper;

public class ProfileActivity extends AppCompatActivity{
    private static final String TAG = "ProfileActivity";
    private Context context=ProfileActivity.this;
    private static final int ACTIVITY_NUM=4;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setUpBottomNavigView();



    }
    /*
    Bottom Navigation Set up
     */

    private void setUpBottomNavigView(){
        BottomNavigationViewEx bottomNavigationViewEx = findViewById(R.id.bottom_navigation);
        Log.d(TAG, "setUpBottomNavigView: "+bottomNavigationViewEx);
        BottomNavigHelper.setUp(bottomNavigationViewEx);
        BottomNavigHelper.NavigEnable(context,bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem mItem = menu.getItem(ACTIVITY_NUM);
        mItem.setChecked(true) ;
    }
}
