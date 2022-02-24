package com.bkacad.nnt.activityandintentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = getIntent();
        String text = i.getStringExtra("key");
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }

    public void backPrevious(View view) {
        onBackPressed();
    }
}