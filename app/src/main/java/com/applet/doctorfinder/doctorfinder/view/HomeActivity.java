package com.applet.doctorfinder.doctorfinder.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.applet.doctorfinder.doctorfinder.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends ActionBarActivity {

    private Toolbar toolbar;
    @BindView(R.id.auto_AllSpecial)
    AutoCompleteTextView auto_AllSpecial;
    @BindView(R.id.auto_subSpecial)
    AutoCompleteTextView auto_subSpecial;
    @BindView(R.id.auto_city)
    AutoCompleteTextView auto_city;
    @BindView(R.id.auto_area)
    AutoCompleteTextView auto_area;
    @BindView(R.id.auto_doctor_name)
    AutoCompleteTextView auto_doctor_name;
    @BindView(R.id.auto_priceRange)
    AutoCompleteTextView auto_priceRange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        //for toolbar button to open nav drawer
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        //-------------

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        navFragment drawerFragment = (navFragment) getSupportFragmentManager().findFragmentById(R.id.draw);
        drawerFragment.setUP((DrawerLayout) findViewById(R.id.drawer_layout), toolbar);

        //add initail values
        String[] city = {"Tokyo", "London", "Newcastle", "NotingHills"};
        String[] speciality = {"Psychiatry", "Otolaryngology", "Vascular", "Reconstructive"};
        ArrayAdapter<String> doctorSpecialityadapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, speciality);
        auto_AllSpecial.setAdapter(doctorSpecialityadapter);
        auto_subSpecial.setAdapter(doctorSpecialityadapter);
        ArrayAdapter<String> doctorCityadapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, city);
        auto_city.setAdapter(doctorCityadapter);
        auto_area.setAdapter(doctorCityadapter);
        String[] doctors = {"John", "Smith", "Arnold", "Ibrahim"};
        ArrayAdapter<String> doctorNameAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, doctors);
        auto_doctor_name.setAdapter(doctorNameAdapter);
        String[] prices = {"50$ : 100 $ ", "100$ : 200 $", "200$ : 400 $", "4000$ "};
        ArrayAdapter<String> doctorPriceAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, prices);
        auto_priceRange.setAdapter(doctorPriceAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @OnClick(R.id.btn_findDoctor)
    public void searchResult(View view) {
        Intent intent = new Intent(this, SearchResults.class);
        startActivity(intent);

    }

    @OnClick(R.id.auto_AllSpecial)
    public void showDropDown(View view) {
        auto_AllSpecial.showDropDown();
    }

    @OnClick(R.id.auto_subSpecial)
    public void showDropDownauto_subSpecial(View view) {
        auto_subSpecial.showDropDown();
    }

    @OnClick(R.id.auto_city)
    public void showDropDownauto_city(View view) {
        auto_city.showDropDown();
    }

    @OnClick(R.id.auto_area)
    public void showDropDownauto_area(View view) {
        auto_area.showDropDown();
    }
    @OnClick(R.id.auto_doctor_name)
    public void showDropDownauto_doctor_name(View view) {
        auto_doctor_name.showDropDown();
    }
    @OnClick(R.id.auto_priceRange)
    public void showDropDownauto_priceRange(View view) {
        auto_priceRange.showDropDown();
    }
}
