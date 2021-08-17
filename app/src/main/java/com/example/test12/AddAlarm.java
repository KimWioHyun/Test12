package com.example.test12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class AddAlarm extends AppCompatActivity {

    Switch sw_ampm;
    EditText et_time_alarm,et_name_alarm;
    Button btn_save_alarm;

    boolean am;
    String na;
    String ti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_alarm);

    sw_ampm=findViewById(R.id.sw_ampm);
    et_time_alarm=findViewById(R.id.et_time_alarm);
    et_name_alarm=findViewById(R.id.et_name_alarm);
    btn_save_alarm=findViewById(R.id.btn_save_alarm);

        am = sw_ampm.isChecked();
        ti = et_time_alarm.getText().toString();
        na = et_name_alarm.getText().toString();


    btn_save_alarm.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            /*et_time_alarm = (EditText) findViewById(R.id.et_time_alarm);
            et_name_alarm = (EditText) findViewById(R.id.et_name_alarm);
            sw_ampm = (Switch) findViewById(R.id.sw_ampm);*/

            String etTimeAlarm = et_time_alarm.getText().toString();
            String etNameAlarm = et_name_alarm.getText().toString();
            Boolean swAmpm = sw_ampm.isChecked();



            Intent intent = new Intent(AddAlarm.this, Alarm.class);

            intent.putExtra("etTimeAlarm",etTimeAlarm);
            intent.putExtra("etNameAlarm",etNameAlarm);
            intent.putExtra("swAmpm",swAmpm);
            Log.d("======", String.valueOf(swAmpm));

            setResult(RESULT_OK,intent);
            finish();

            //startActivity(intent);
        }
    });

    }

}