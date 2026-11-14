package com.tjh.examtjh;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class GoodsActivity extends AppCompatActivity {
    private ListView lvPhone;
    private List<PhoneActivity> phoneList;
    private String userName; //从登录页传过来的姓名

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods);
        lvPhone = findViewById(R.id.lv_phone);

        //接收登录页面传递过来的姓名
        userName = getIntent().getStringExtra("user_name");

        //初始化不少于5组手机数据，图片放到drawable-xxhdpi
        phoneList = new ArrayList<>();
        phoneList.add(new PhoneActivity(R.drawable.xiaomi_pic, "小米17", "4999元"));
        phoneList.add(new PhoneActivity(R.drawable.oppo_pic, "OPPO Find X8", "5499元"));
        phoneList.add(new PhoneActivity(R.drawable.vivo_pic, "VIVO X200", "4299元"));
        phoneList.add(new PhoneActivity(R.drawable.huawei_pic, "华为Mate70", "5999元"));
        phoneList.add(new PhoneActivity(R.drawable.iphone_pic, "苹果16", "6299元"));
        phoneList.add(new PhoneActivity(R.drawable.iphone1_pic, "苹果16Pro", "7999元"));

        //自定义适配器
        MyAdapter adapter = new MyAdapter();
        lvPhone.setAdapter(adapter);

        //子项点击事件
        lvPhone.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                PhoneActivity phone = phoneList.get(position);
                //拼接Toast字符串，和题目格式一致
                String toastText = userName + "点击预购了" + phone.getPhoneName() + "手机，价格为" + phone.getPrice();
                Toast.makeText(GoodsActivity.this, toastText, Toast.LENGTH_SHORT).show();
            }
        });
    }

    //自定义BaseAdapter
    class MyAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return phoneList.size();
        }
        @Override
        public Object getItem(int position) {
            return phoneList.get(position);
        }
        @Override
        public long getItemId(int position) {
            return position;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if(convertView == null){
                convertView = View.inflate(GoodsActivity.this, R.layout.activity_phone, null);
                holder = new ViewHolder();
                holder.ivPhone = convertView.findViewById(R.id.iv_phone);
                holder.tvName = convertView.findViewById(R.id.tv_name);
                holder.tvPrice = convertView.findViewById(R.id.tv_price);
                convertView.setTag(holder);
            }else{
                holder = (ViewHolder) convertView.getTag();
            }
            PhoneActivity p = phoneList.get(position);
            holder.ivPhone.setImageResource(p.getImgId());
            holder.tvName.setText(p.getPhoneName());
            holder.tvPrice.setText(p.getPrice());
            return convertView;
        }
        class ViewHolder{
            ImageView ivPhone;
            TextView tvName, tvPrice;
        }
    }
}

