package com.applet.doctorfinder.doctorfinder;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class HomeActivity extends ActionBarActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain_appbar);

         toolbar=(Toolbar)findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        //for toolbar button to open nav drawer
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        //-------------

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        navFragment drawerFragment=(navFragment)getSupportFragmentManager().findFragmentById(R.id.draw);
        drawerFragment.setUP((DrawerLayout)findViewById(R.id.drawer_layout),toolbar);
    }

}
