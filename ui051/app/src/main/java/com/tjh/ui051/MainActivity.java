package com.tjh.ui051;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private String imgSrc = "cherry";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        ImageView img = findViewById(R.id.imageView1);
        Button btn1 = findViewById(R.id.button1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ("cherry".equals(imgSrc)) {

                    img.setImageResource(R.drawable.orange_pic);
                    imgSrc = "orange_pic";
                    Toast.makeText(MainActivity.this, "图片更换成橘子", Toast.LENGTH_SHORT).show();
                } else {
                    img.setImageResource(R.drawable.cherry_pic);
                    imgSrc = "cherry";
                    Toast.makeText(MainActivity.this, "图片更换成樱桃", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}