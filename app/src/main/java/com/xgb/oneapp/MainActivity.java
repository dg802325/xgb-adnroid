package com.xgb.oneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.xgb.oneapp.activity.Image2Activity;
import com.xgb.oneapp.activity.ListActivity;
import com.xgb.oneapp.activity.SecondActivity;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到id为tv的TextView控件
        TextView tv = findViewById(R.id.tv);

        tv.setText("代码中设置文字");

        Button bt = findViewById(R.id.bt1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //当点击按钮后，会执行这个方法
                //显示一个提示
                Toast.makeText(MainActivity.this,"你还真点击啊",Toast.LENGTH_SHORT).show();

            }
        });

        Button btOpen = findViewById(R.id.bt_onpen);
        btOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent 可以翻译为意图
                //这里启动secondActity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                //启动
                startActivity(intent);
            }
        });

    }

    /**
     * 显示图片
     * @param view
     */
    public void showImage(View view) {
        Intent intent = new Intent(MainActivity.this, Image2Activity.class);
        startActivity(intent);
    }

    public void showList(View view) {
        Intent intent = new Intent(MainActivity.this, ListActivity.class);
        startActivity(intent);
    }
}
