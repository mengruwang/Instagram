package com.mengrudaddy.instagram;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.mengrudaddy.instagram.utils.BottomNavigHelper;
import com.mengrudaddy.instagram.utils.BottomSwitchHelper;

public class Video extends AppCompatActivity{
    private static final String TAG = "Video";
    private static final int ACTIVITY_NUM=2;
    private Context context=Video.this;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        setUpBottomSwitchView();
        //overridePendingTransition(R.anim.slide_up, R.anim.slide_down);


    }

    public void close(View view) {
        finish();

    }
    private void setUpBottomSwitchView(){
        BottomNavigationViewEx bt_switch = findViewById(R.id.bottom_switch);
        Log.d(TAG, "setUpBottomSwitchView: in video.class ##########"+bt_switch);
        //BottomSwitchHelper.setUp(bt_switch);
        BottomSwitchHelper.SwitchEnable(context,bt_switch);
        Menu menu = bt_switch.getMenu();
        MenuItem mItem = menu.getItem(ACTIVITY_NUM);
        mItem.setChecked(true) ;
    }
}
