package com.example.test12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Alarm extends AppCompatActivity {

    ImageView btn_addalarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        btn_addalarm = findViewById(R.id.btn_addalarm);

        btn_addalarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Alarm.this, AddAlarm.class);
                startActivityForResult(intent,1000);

            }
        });

    }


}