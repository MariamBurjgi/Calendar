package com.hmcoding.lesson3exer2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatePickerDialog dp = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                TextView tv = findViewById(R.id.txt);

                int mont = year+1;

                tv.setText("hi"+year+"/"+month);


            }
        }, 2023, 0, 6);
        dp.show();

    }
}