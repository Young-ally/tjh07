package com.chenlongyu.examchenlongyu2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PhoneListActivity extends AppCompatActivity {

    // 手机数据
    private static class PhoneItem {
        int imgRes;
        String name;
        String price;
        PhoneItem(int imgRes, String name, String price) {
            this.imgRes = imgRes;
            this.name = name;
            this.price = price;
        }
    }

    PhoneItem[] phoneData = {
            new PhoneItem(R.drawable.mi, "小米17", "4999"),
            new PhoneItem(R.drawable.oppo, "OPPO Find X8", "5499"),
            new PhoneItem(R.drawable.vivo, "vivo X200", "4699"),
            new PhoneItem(R.drawable.huawei, "华为Mate70", "6499"),
            new PhoneItem(R.drawable.iphone, "iPhone 16", "5999")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_list);

        String username = getIntent().getStringExtra("username");
        LinearLayout container = findViewById(R.id.ll_container);

        LayoutInflater inflater = LayoutInflater.from(this);

        for (PhoneItem item : phoneData) {
            View itemView = inflater.inflate(R.layout.item_phone, container, false);

            ImageView iv = itemView.findViewById(R.id.iv_phone);
            TextView tvName = itemView.findViewById(R.id.tv_name);
            TextView tvPrice = itemView.findViewById(R.id.tv_price);

            iv.setImageResource(item.imgRes);
            tvName.setText(item.name);
            tvPrice.setText(item.price + " 元");

            // 点击监听
            itemView.setOnClickListener(v -> {
                String tip = username + "点击预购了" + item.name + "手机，价格为" + item.price + "元";
                Toast.makeText(PhoneListActivity.this, tip, Toast.LENGTH_SHORT).show();
            });
            container.addView(itemView);
        }
    }
}
