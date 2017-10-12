package com.applet.doctorfinder.doctorfinder.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.applet.doctorfinder.doctorfinder.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_signin)
    public void signIn(View view) {
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);

    }

    @OnClick(R.id.image_signup)
    public void signup(View view) {
        Intent intent = new Intent(this,SignUpGeneral.class);
        startActivity(intent);

    }
}
