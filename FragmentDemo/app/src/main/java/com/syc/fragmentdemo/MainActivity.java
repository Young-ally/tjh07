package com.syc.fragmentdemo;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.syc.fragmentdemo.layout.Right2Fragment;
import com.syc.fragmentdemo.layout.RightFragment;

public class MainActivity extends AppCompatActivity {
    private Fragment rightFragment;
    private Fragment right2Fragment;

    private void replaceFragment(Fragment fragment) {
        // 手机布局只保留左侧 Fragment，没有 rightLayout 容器，避免替换时崩溃
        if (findViewById(R.id.rightLayout) == null) {
            return;
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment currentFragment = fragmentManager.findFragmentById(R.id.rightLayout);
        // 关键检查：如果目标Fragment类型与当前相同，则返回
        if (currentFragment != null && currentFragment.getClass().equals(fragment.getClass())) {
            return;
        }
        // 开启事务
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        // 完成碎片填充帧布局
        transaction.replace(R.id.rightLayout, fragment);
        // 事务添加返回栈操作
        transaction.addToBackStack(null);
        // 事务提交
        transaction.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        right2Fragment = new Right2Fragment();
        rightFragment = new RightFragment();
        replaceFragment(rightFragment);
        // 点击按钮后替换布局
        View btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(right2Fragment);
            }
        });
    }
}
