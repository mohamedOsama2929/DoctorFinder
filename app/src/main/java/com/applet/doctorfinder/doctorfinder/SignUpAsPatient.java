package com.applet.doctorfinder.doctorfinder;

import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class SignUpAsPatient extends AppCompatActivity {
    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(), "DatePickerDialog");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_as_patient);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setLogo(R.drawable.arrow);

        ArrayList<String> data=new ArrayList<String>();
        data.add("+98");

        Spinner spinner=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(), R.layout.spinner_layout,data);
        spinner.setAdapter(adapter);
    }
}
