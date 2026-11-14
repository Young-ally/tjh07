package com.tjh.broadcastdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 自定义时间改变类，继承BroadcastReceiver，重写onReceive方法
    class TimeChangeReceiver extends BroadcastReceiver{
        @Override
        // 当收到广播时调用此方法
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context,"time has changed", Toast.LENGTH_SHORT).show();
        }
    }

    private TimeChangeReceiver timeChangeReceiver;
    private IntentFilter intentFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intentFilter = new IntentFilter();
        timeChangeReceiver = new TimeChangeReceiver();
        // 定义过滤动作为时间改变 android.intent.action.TIME_TICK
        intentFilter.addAction("android.intent.action.TIME_TICK");

        // 广播注册，第一个参数为自定义的广播处理类，第二个是广播过滤动作action
        registerReceiver(timeChangeReceiver, intentFilter);
    }

    // 当活动销毁时调用此方法
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 注销广播接收器，避免内存泄漏
        unregisterReceiver(timeChangeReceiver);
    }
}

