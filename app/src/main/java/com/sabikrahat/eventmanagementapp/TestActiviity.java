package com.sabikrahat.eventmanagementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class TestActiviity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_activiity);
  //      demoLog();
    }
    public void demoLog(){
        Log.e("payal","test");
        Toast.makeText(this, "dummy", Toast.LENGTH_SHORT).show();
    }
}