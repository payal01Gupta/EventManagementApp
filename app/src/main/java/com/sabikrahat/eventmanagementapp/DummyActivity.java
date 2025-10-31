package com.sabikrahat.eventmanagementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class DummyActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dummy);
        textView = findViewById(R.id.tv_dummy);
        textView.setText("Payal Gupta");
        payalcode();

        Log.e("payal","dummy");
        testDummy();
    }

    private void testDummy() {
        Toast.makeText(this, "dummy method", Toast.LENGTH_SHORT).show();
    }




    private void payalcode(){
        Toast.makeText(this,"hlo hi",Toast.LENGTH_SHORT).show();
    }

}