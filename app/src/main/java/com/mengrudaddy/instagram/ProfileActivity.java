package com.mengrudaddy.instagram;

import android.content.Context;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.mengrudaddy.instagram.utils.BottomNavigHelper;

public class ProfileActivity extends AppCompatActivity{
    private static final String TAG = "ProfileActivity";
    private Context context=ProfileActivity.this;
    private static final int ACTIVITY_NUM=4;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile);
        setUpBottomNavigView();



    }
    /*
    Bottom Navigation Set up
     */

    private void setUpBottomNavigView(){
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        Log.d(TAG, "setUpBottomNavigView: "+bottomNavigationView);
        BottomNavigHelper.setUp(bottomNavigationView);
        BottomNavigHelper.NavigEnable(context,bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem mItem = menu.getItem(ACTIVITY_NUM);
        mItem.setChecked(true);
    }
}
