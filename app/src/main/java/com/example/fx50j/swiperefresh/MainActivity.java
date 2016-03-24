package com.example.fx50j.swiperefresh;

import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Data> list = new ArrayList<Data>();
    private MyAdapter adapter;
    private SwipeRefreshLayout swipe_refresh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init_list();
        init_view();

    }

    private void init_list() {
        for (int i = 0; i < 50;i++){
            Data data = new Data("item" + i);
            list.add(data);
        }
    }

    public void init_view(){

        Toolbar toolbar = (Toolbar) findViewById(R.id.toobar);
        toolbar.setTitle("this is a Toolbar");
        setSupportActionBar(toolbar);

        ListView lv = (ListView) findViewById(R.id.lv);
        adapter = new MyAdapter(this,0,list);
        lv.setAdapter(adapter);


        //详细代码 http://www.webtag123.com/android/2272.html
        swipe_refresh = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh);
        swipe_refresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                    new Handler().postDelayed(new Runnable() {
                        @Override public void run() {
                            swipe_refresh.setRefreshing(false);
                        }
                    }, 5000);
            }
        });
        //加载颜色是循环播放的，只要没有完成刷新就会一直循环，color1>color2>color3>color4
        swipe_refresh.setColorScheme(android.R.color.white,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light, android.R.color.holo_red_light);
    }
}
