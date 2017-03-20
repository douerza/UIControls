package com.example.douzaer.uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/16.
 */

public class ActionModeActivity extends AppCompatActivity {
    private ActionMode mActionMode;
    private ActionMode.Callback mCallback = new ActionMode.Callback()
    {
        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu)
        {
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode)
        {
            mActionMode = null;
        }

        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu)
        {
            MenuInflater inflater = mode.getMenuInflater();
            inflater.inflate(R.menu.multi_acitonmode_menu, menu);
            return true;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item)
        {
            return true;
        }

    };
    private String[] names = new String[]
            { "One", "Two", "Three", "Four","Five","Six"};
    private int[] imageIds = new int[]
            {R.drawable.cat,R.drawable.cat,R.drawable.cat,R.drawable.cat,R.drawable.cat,R.drawable.cat};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actionmode);

        // 创建一个List集合，List集合的元素是Map
        final List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < names.length; i++)
        {
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("names", names[i]);
            listItem.put("imageIds", imageIds[i]);
            listItems.add(listItem);
        }
        // 创建一个SimpleAdapter
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, listItems,
                R.layout.context_menu_action_mode_item,
                new String[] { "imageIds","names"},
                new int[] { R.id.contextimage, R.id.contextnum });
        final ListView list = (ListView) findViewById(R.id.context_menu_listView);
        // 为ListView设置Adapter
        list.setAdapter(simpleAdapter);
        // 为ListView的列表项的单击事件绑定事件监听器
        list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            // 第position项被单击时激发该方法
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                mActionMode = startSupportActionMode(mCallback);
                mActionMode.setTitle("选中"+names[position]);
            }
        });
    }


}
