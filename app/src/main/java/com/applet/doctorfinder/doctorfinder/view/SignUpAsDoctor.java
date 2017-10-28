package com.applet.doctorfinder.doctorfinder.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;

import com.applet.doctorfinder.doctorfinder.R;

import java.util.ArrayList;

import butterknife.OnClick;

public class SignUpAsDoctor extends AppCompatActivity {

    String[] city = {"Tokyo","London","Newcastle","NotingHills"};
    String[] speciality = {"Psychiatry","Otolaryngology","Vascular","Reconstructive"};

    public void back(View view){

        Intent intent = new Intent(this,SignUpGeneral.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_as_doctor);

        Toolbar toolbar=(Toolbar)findViewById(R.id.signUpDoctorToolbar);
        toolbar.setLogo(R.drawable.arrow);
        View view = toolbar.getChildAt(1);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SignUpGeneral.class);
                startActivity(intent);
            }
        });

        final AutoCompleteTextView doctorSpeciality = (AutoCompleteTextView) findViewById(R.id.doctorSpeciality);
        final AutoCompleteTextView doctorSubSpeciality = (AutoCompleteTextView) findViewById(R.id.doctorSubSpeciality);
        final AutoCompleteTextView doctorCity = (AutoCompleteTextView) findViewById(R.id.doctorCity);
        final AutoCompleteTextView doctorArea = (AutoCompleteTextView) findViewById(R.id.doctorArea);

        ArrayAdapter<String> doctorSpecialityadapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, speciality);
        ArrayAdapter<String> doctorSubSpecialityadapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, speciality);
        ArrayAdapter<String> doctorCityadapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, city);
        ArrayAdapter<String> doctorAreaadapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, city);

        doctorSpeciality.setAdapter(doctorSpecialityadapter);
        doctorSubSpeciality.setAdapter(doctorSubSpecialityadapter);
        doctorCity.setAdapter(doctorCityadapter);
        doctorArea.setAdapter(doctorAreaadapter);

        findViewById(R.id.doctorSpeciality).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doctorSpeciality.showDropDown();
            }
        });

        findViewById(R.id.doctorSubSpeciality).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doctorSubSpeciality.showDropDown();
            }
        });

        findViewById(R.id.doctorCity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doctorCity.showDropDown();
            }
        });

        findViewById(R.id.doctorArea).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doctorArea.showDropDown();
            }
        });

    }
}
