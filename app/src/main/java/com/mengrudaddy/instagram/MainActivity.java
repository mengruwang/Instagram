package com.mengrudaddy.instagram;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.mengrudaddy.instagram.utils.BottomNavigHelper;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Context context=MainActivity.this;
    private static final int ACTIVITY_NUM=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpBottomNavigView();;



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
    public void openFullScreenCamera(View view){
        Intent activity = new Intent(MainActivity.this, FullScreenCapture.class);
        startActivity(activity);
    }


}
