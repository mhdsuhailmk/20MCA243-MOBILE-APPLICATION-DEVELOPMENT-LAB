package com.example.simpleimplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "opening browser..", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent();

                myIntent.setAction(Intent.ACTION_VIEW);
                myIntent.setData(Uri.parse("https://google.com"));
                startActivity(myIntent);
            }
        });



    }
}