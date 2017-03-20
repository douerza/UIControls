package com.example.douzaer.uicontrols;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.widget.Toast;


/**
 * Created by Administrator on 2017/3/16.
 */

public class AlertDialogActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alertdialog);
    }

    public void Button05Click(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View loginForm = LayoutInflater.from(this).inflate(R.layout.activity_login, null);
        builder.setView(loginForm);
        builder.setPositiveButton("Sign in",new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog,int which) {
            }
        });
        builder.setNegativeButton("Cancle",new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog,int which) {}
        });
        builder.show();
    }
}
