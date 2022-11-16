package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    TextView welcomeBanner,emailBanner;
    String uname,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


       uname = getIntent().getStringExtra("username");
       email = getIntent().getStringExtra("useremail");

       welcomeBanner = findViewById(R.id.welcomeBanner);
       emailBanner = findViewById(R.id.emailBanner);

       welcomeBanner.setText("Welcome "+uname);
       emailBanner.setText("Your email id is:"+email);

    }
}