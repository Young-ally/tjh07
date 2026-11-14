package com.tjh.listview;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.tjh.listview.adapter.FruitAdapter;
import com.tjh.listview.entity.Fruit;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        initFruitList();

        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);

        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Fruit fruit = fruitList.get(position);
            Toast.makeText(MainActivity.this, fruit.getName() + "被选中", Toast.LENGTH_SHORT).show();
        });
    }

    private void initFruitList() {
        for (int i = 0; i < 2; i++) {
            fruitList.add(new Fruit("Apple",R.drawable.apple_pic));
            fruitList.add(new Fruit("Banana", R.drawable.banana_pic));
            fruitList.add(new Fruit("Grape", R.drawable.grape_pic));
            fruitList.add(new Fruit("Mango",R.drawable.mango_pic));
            fruitList.add(new Fruit("Pear",R.drawable.pear_pic));
            fruitList.add(new Fruit("Pineapple",R.drawable.pineapple_pic));
            fruitList.add(new Fruit("Strawberry",R.drawable.strawberry_pic));
            fruitList.add(new Fruit("Watermelon",R.drawable.watermelon_pic));
        }
    }
}
