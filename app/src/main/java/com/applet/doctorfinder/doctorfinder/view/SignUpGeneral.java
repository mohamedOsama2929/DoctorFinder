package com.applet.doctorfinder.doctorfinder.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.applet.doctorfinder.doctorfinder.R;

import butterknife.OnClick;

public class SignUpGeneral extends AppCompatActivity {

    public void Go(View view){

        Intent intent = new Intent(this,SignUpAsDoctor.class);
        startActivity(intent);

    }
    public void signpatient(View view){

        Intent intent = new Intent(this,SignUpAsPatient.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_general);
    }
}
