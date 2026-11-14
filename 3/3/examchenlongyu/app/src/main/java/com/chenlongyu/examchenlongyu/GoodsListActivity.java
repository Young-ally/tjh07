package com.chenlongyu.examchenlongyu;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class GoodsListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_list);

        TextView tvWelcome = findViewById(R.id.tv_welcome);
        String name = getIntent().getStringExtra("user_name");
        tvWelcome.setText("欢迎：" + name);
    }
}
