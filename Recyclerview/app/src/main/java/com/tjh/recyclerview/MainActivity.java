package com.tjh.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.tjh.recyclerview.adapter.FruitAdapter;
import com.tjh.recyclerview.entity.Fruit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // 定义FruitList列表
    private List<Fruit> fruitList = new ArrayList<>();

    private void initFruitList() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit(getRandomString("Apple"), R.drawable.apple_pic);
            fruitList.add(apple);

            Fruit banana = new Fruit(getRandomString("Banana"), R.drawable.banana_pic);
            fruitList.add(banana);

            Fruit watermelon = new Fruit(getRandomString("WaterMelon"), R.drawable.watermelon_pic);
            fruitList.add(watermelon);

            Fruit pear = new Fruit(getRandomString("Pear"), R.drawable.pear_pic);
            fruitList.add(pear);

            Fruit grape = new Fruit(getRandomString("Grape"), R.drawable.grape_pic);
            fruitList.add(grape);

            Fruit PineApple = new Fruit(getRandomString("PineApple"), R.drawable.pineapple_pic);
            fruitList.add(PineApple);

            Fruit strawberry = new Fruit(getRandomString("StrawBerry"), R.drawable.strawberry_pic);
            fruitList.add(strawberry);

            Fruit mango = new Fruit(getRandomString("Mango"), R.drawable.mango_pic);
            fruitList.add(mango);
        }
    }

    private String getRandomString(String keyword) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < random.nextInt(20) + 1; i++) {
            stringBuilder.append(keyword);
        }
        return stringBuilder.toString();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.initFruitList();

        // 使用自己设计的Recycler完成Adapter实例的创建
        FruitAdapter adapter = new FruitAdapter(fruitList);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // 创建的适配器设置为ListView的数据适配器，这样ListView就可以显示数据了
        recyclerView.setAdapter(adapter);

        // recycler需要制定布局方式，这里采用线性布局方式完成
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
    }
}

