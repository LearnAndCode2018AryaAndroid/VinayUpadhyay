package com.example.vinay.myfirstapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    Button b1, b2;
    TextView t;
    EditText e1,e2,e3,e4,e5;
    @Override
            public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        t = findViewById(R.id.textview);

        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText2);
        e3 = findViewById(R.id.editText2);
        e4 = findViewById(R.id.editText2);
        e5 = findViewById(R.id.editText2);



        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUp.this, MainActivity.class));

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUp.this, MainActivity.class));
            }
        });
    }


    @Override
    public void onBackPressed(){finish();}


}