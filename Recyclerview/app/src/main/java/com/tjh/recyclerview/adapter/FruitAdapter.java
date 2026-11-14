package com.tjh.recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.tjh.recyclerview.R;
import com.tjh.recyclerview.entity.Fruit;

import java.util.List;

// FruitAdapter类继承自RecyclerView.Adapter，泛型参数指定了
// ViewHolder的类型为FruitAdapter.ViewHolder
public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {

    private List<Fruit> fruitList;

    // ViewHolder内部类继承自RecyclerView.ViewHolder
    // ViewHolder用于缓存布局中的视图组件，以提高性能
    class ViewHolder extends RecyclerView.ViewHolder {
        TextView fruitName;
        ImageView fruitImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fruitName = itemView.findViewById(R.id.fruitName);
            fruitImage = itemView.findViewById(R.id.fruitImageId);
        }
    }

    // 构造函数
    public FruitAdapter(List<Fruit> fruitList) {
        this.fruitList = fruitList;
    }

    // onCreateViewHolder方法用于创建ViewHolder实例
    // 这个方法会在RecyclerView需要展示新的item时被调用
    @NonNull
    @Override
    public FruitAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 填充子项视图
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_fruit, parent, false);
        // 设置子项视图的控件显示内容
        ViewHolder viewHolder = new ViewHolder(view);
        // 得到用于缓存的viewHolder对象
        return viewHolder;
    }

    // onBindViewHolder方法用于绑定ViewHolder和数据
    // 这个方法会在RecyclerView需要展示或更新item时被调用
    @Override
    public void onBindViewHolder(@NonNull FruitAdapter.ViewHolder holder, int position) {
        Fruit fruit = fruitList.get(position);

        holder.fruitImage.setImageResource(fruit.getImageId());
        holder.fruitName.setText(fruit.getName());
    }

    // 获取子项的总数量
    @Override
    public int getItemCount() {
        return fruitList.size();
    }
}

