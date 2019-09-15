package com.xgb.oneapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.xgb.oneapp.R;
import com.xgb.oneapp.util.TestUtils;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button close = findViewById(R.id.bt_close);
        close.setOnClickListener(this);

        final EditText editText = findViewById(R.id.et_userName);
        Button login = findViewById(R.id.bt_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = editText.getText().toString().trim();
                if(TestUtils.isEmpty(userName)){
                    Toast.makeText(SecondActivity.this, "用户名不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(SecondActivity.this, "您的 用户名是："+userName, Toast.LENGTH_SHORT).show();
            }
        });





    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
