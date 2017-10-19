package com.applet.doctorfinder.doctorfinder.view;

import android.app.DialogFragment;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.applet.doctorfinder.doctorfinder.R;

import java.util.Calendar;

public class doctorprofile extends AppCompatActivity {


    TabLayout tabLayout;
    ViewPager viewPager;

    static String dayche;
    TextView daycheck;

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(), "DatePickerDialog");
        daycheck.setText(dayche);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorprofile);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setLogo(R.drawable.arrow);

        View view = toolbar.getChildAt(1);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(intent);
            }
        });


        daycheck=(TextView)findViewById(R.id.calender);
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        dayche=day +"/"+month+"/"+year;
        daycheck.setText(dayche);

        tabLayout=(TabLayout)findViewById(R.id.tablayout);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        viewPager.setAdapter(new CustomAdapter(getSupportFragmentManager(),getApplicationContext()));
        tabLayout.setupWithViewPager(viewPager);


    }

    public class CustomAdapter extends FragmentPagerAdapter {

        private String fragments []={"Doctor Information","Doctor Reviews"};
        public CustomAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new fragment1();
                case 1:
                    return new fragment2();
                default:
                    return null;
            }
        }



        @Override
        public int getCount() {
            return fragments.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return fragments[position] ;
        }
    }
}
