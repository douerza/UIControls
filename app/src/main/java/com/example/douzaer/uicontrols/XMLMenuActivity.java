package com.example.douzaer.uicontrols;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by Administrator on 2017/3/16.
 */

public class XMLMenuActivity extends AppCompatActivity {
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xmlmenu);
        txt = (TextView) findViewById(R.id.menutext);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflator = new MenuInflater(this);
        inflator.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem mi)
    {
        if (mi.isCheckable())
        {
            mi.setCheckable(true);
        }
        switch (mi.getItemId())
        {
            case R.id.item11:
                txt.setTextSize(40);
                break;
            case R.id.item12:
                txt.setTextSize(30);
                break;
            case R.id.item13:
                txt.setTextSize(20);
                break;
            case R.id.item02:
                Toast toast = Toast.makeText(XMLMenuActivity.this,"点击了普通菜单项",Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.item31:
                txt.setTextColor(Color.RED);
                break;
            case R.id.item32:
                txt.setTextColor(Color.BLACK);
                break;
        }
        return true;
    }
}
