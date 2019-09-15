package com.xgb.oneapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.xgb.oneapp.R;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView rv = findViewById(R.id.rv);
        //如果你知道你的RecyclerView的高度不会发生变化
        //使用此设置可以提高性能
        rv.setHasFixedSize(true);

        //设置一个管理布局，如何显示 是横向还是纵向
        //默认垂直横向
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(linearLayoutManager);
    }
}
