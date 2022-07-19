package com.company.mathgameproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button addition;
    Button subtraction;
    Button multiplication;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addition =  findViewById(R.id.buttonadd);
        subtraction = findViewById(R.id.buttonsub);
        multiplication = findViewById(R.id.buttonmulti);


        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Addition.class);

                startActivity(intent);

            }
        });




    }
}