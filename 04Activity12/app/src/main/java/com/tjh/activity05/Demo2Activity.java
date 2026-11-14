package com.tjh.activity05;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Demo2Activity extends AppCompatActivity {
    public static final int RESULT_OK=0;
    public static final int RESULT_CANCELED=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_demo2);
        Log.d("DemoMag",toString());
        // 接收来自Demo1Activity的数据
        Intent intent=getIntent();
        String dataMag=intent.getStringExtra("data");
        Log.d("tjh",dataMag);
        // 传递数据返回给Demo1Activity
        Button btn2=findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Demo2Activity.this,DemoActivity.class));
                Intent returnIntent=new Intent();
                returnIntent.putExtra("returnData","从Demo2返回的一些数据");
                setResult(RESULT_OK,returnIntent);
                // 退出并销毁当前Activity
                finish();
            }
        });
    }
}