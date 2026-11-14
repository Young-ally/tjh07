package com.tjh.examtjh; //改成你自己的包名

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText etName, etPwd;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.et_name);
        etPwd = findViewById(R.id.et_pwd);
        btnLogin = findViewById(R.id.btn_login);

        //登录点击监听
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取姓名
                String name = etName.getText().toString().trim();
                //跳转商品页面，携带name数据
                Intent intent = new Intent(MainActivity.this, GoodsActivity.class);
                intent.putExtra("user_name", name);
                startActivity(intent);
            }
        });
    }
}


