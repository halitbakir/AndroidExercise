package com.halitbakir.androidd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityConnectionBlue extends AppCompatActivity {
    //Global Değişkenler
    private EditText editTextBlue;
    private Button buttonBlue;

    private String userData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection_blue);
        //ID
        editTextBlue=findViewById(R.id.editTextBlue);
        buttonBlue=findViewById(R.id.buttonBlue);

        //Set on click listener
        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blueIntent=new Intent(getApplicationContext(),ActivityConnectionYellow.class);
                userData=editTextBlue.getText().toString();
                Toast.makeText(ActivityConnectionBlue.this, userData, Toast.LENGTH_SHORT).show();
                blueIntent.putExtra("key_blue",userData);
                startActivity(blueIntent);
                //yukardakiler datayı diğer activitye yollamak için
            }
        });
    }
}