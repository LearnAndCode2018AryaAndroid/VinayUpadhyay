package com.example.vinay.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView txtView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txtView = findViewById(R.id.text_view);

    }



    @Override
    public void onBackPressed(){android.os.Process.killProcess(android.os.Process.myPid());}



}
