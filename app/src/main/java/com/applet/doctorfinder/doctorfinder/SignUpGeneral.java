package com.applet.doctorfinder.doctorfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignUpGeneral extends AppCompatActivity {

    public void Go(View view){
        Intent intent = new Intent(this, SignUpAsDoctor.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_general);
    }
}
