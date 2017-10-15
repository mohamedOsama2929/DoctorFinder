package com.applet.doctorfinder.doctorfinder.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

import com.applet.doctorfinder.doctorfinder.R;

public class HomeActivity extends AppCompatActivity {

  //  private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain_appbar);
        ButterKnife.bind(this);

      //   toolbar=(Toolbar)findViewById(R.id.app_bar);
       // setSupportActionBar(toolbar);

        //for toolbar button to open nav drawer
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        /*
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        */
        //-------------

        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        navFragment drawerFragment=(navFragment)getSupportFragmentManager().findFragmentById(R.id.draw);
        drawerFragment.setUP((DrawerLayout)findViewById(R.id.drawer_layout));
    }
    @OnClick(R.id.btn_findDoctor)
    public void searchResult(View view) {
        Intent intent = new Intent(this,SearchResults.class);
        startActivity(intent);

    }

}
