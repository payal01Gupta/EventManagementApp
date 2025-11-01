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

        Log.e("payal","dummy");
        test();
        dummyMethod();
        testDummy();
    }

    private void dummyMethod() {
        Toast.makeText(this, "Event Information", Toast.LENGTH_SHORT).show();
    }
    private void test() {
        Toast.makeText(this, "dummy method toast", Toast.LENGTH_SHORT).show();
    }

    private void testDummy() {
        Toast.makeText(this, "dummy method from local child branch", Toast.LENGTH_SHORT).show();
    }


    private void payalcode(){
        Toast.makeText(this,"hlo hi",Toast.LENGTH_SHORT).show();
    }

}