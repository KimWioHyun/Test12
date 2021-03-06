package com.example.test12;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Alarm extends AppCompatActivity {

    ImageView btn_addalarm;
    ListView lv_alarm;
    AlarmAdapter alarmAdapter;

    List<AlarmVO> data;
    final int ADDALARM = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        btn_addalarm = findViewById(R.id.btn_addalarm);
        lv_alarm = findViewById(R.id.lv_alarm);

        data=new ArrayList<AlarmVO>();

        alarmAdapter=new AlarmAdapter(getApplicationContext(),R.layout.alarmlist,data);
        lv_alarm.setAdapter(alarmAdapter);

        btn_addalarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Alarm.this, AddAlarm.class);
                startActivityForResult(intent,ADDALARM);
            }
        });

    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

            if (requestCode == ADDALARM){
                if(resultCode == RESULT_OK){
                    Boolean am = data.getBooleanExtra("swAmpm",true);
                    String na = data.getStringExtra("etNameAlarm");
                    String ti = data.getStringExtra("etTimeAlarm");
                    String ampm = "";
                    if (am){
                        ampm = "오후";
                    }else {
                        ampm = "오전";
                    }

                    this.data.add(new AlarmVO(ampm, na, ti));
                    alarmAdapter.notifyDataSetChanged();
                }
            }
    }
}