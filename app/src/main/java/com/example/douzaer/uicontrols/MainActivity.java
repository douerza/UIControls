package com.example.douzaer.uicontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Button01Click(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, ListViewActivity.class);
        MainActivity.this.startActivity(intent);
    }

    public void Button02Click(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, AlertDialogActivity.class);
        MainActivity.this.startActivity(intent);
    }

    public void Button03Click(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, XMLMenuActivity.class);
        MainActivity.this.startActivity(intent);
    }

    public void Button04Click(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, ActionModeActivity.class);
        MainActivity.this.startActivity(intent);
    }
}