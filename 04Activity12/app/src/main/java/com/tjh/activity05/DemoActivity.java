package com.tjh.activity05;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_layout);
        Log.d("DemoMag",toString());
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DemoActivity.this,
                        "跳转Demo2",
                        Toast.LENGTH_LONG).show();
            Intent intent = new Intent(DemoActivity.this, Demo2Activity.class);
            // Intent intent = new Intent("com.esn.activitylearning.ACTION_TEST");
            String data="一些需要传递到Demo2的数据";
            intent.putExtra("data",data);
            //startActivityIfNeeded(intent,101);
            startActivityForResult(intent,101);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.main,menu);
       return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId=item.getItemId();
        if(itemId==R.id.add_item){
            Toast.makeText(this,"add",Toast.LENGTH_SHORT).show();
        } else if (itemId==R.id.remove_item) {
            Toast.makeText(this,"del",Toast.LENGTH_SHORT).show();
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(data != null){
            switch(requestCode){
                case 101:
                    Log.d("tjh", data.getStringExtra("returnData"));
                    break;
                default:
            }
        }

    }

}