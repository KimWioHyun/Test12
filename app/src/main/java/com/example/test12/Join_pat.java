package com.example.test12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Join_pat extends AppCompatActivity {

    Button btn_join_pat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_pat);

    btn_join_pat = findViewById(R.id.btn_join_pat);

    btn_join_pat.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Join_pat.this, Login_pat.class);
            startActivity(intent);
        }
    });




    }
}