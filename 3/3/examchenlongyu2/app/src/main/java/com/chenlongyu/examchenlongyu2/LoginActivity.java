package com.chenlongyu.examchenlongyu2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etName = findViewById(R.id.et_name);
        Button btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(v -> {
            String userName = etName.getText().toString().trim();
            Intent intent = new Intent(LoginActivity.this, PhoneListActivity.class);
            intent.putExtra("username", userName);
            startActivity(intent);
        });
    }
}
