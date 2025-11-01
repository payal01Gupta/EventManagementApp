package com.sabikrahat.eventmanagementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ChildBranchTaskPopup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_branch_task_popup);
        chidlBranchTask();
    }

    private void chidlBranchTask() {
        Log.e("payal", "Child Branch");
    }
}