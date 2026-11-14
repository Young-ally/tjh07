package com.tjh.fragmentdemo.layout;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.tjh.fragmentdemo.R;

public class RightFragment extends Fragment {
    @Override
    public void onAttach(@NonNull Context context) {
        Log.d("tjh", "RightFragment onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("tjh", "RightFragment onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("tjh", "RightFragment onCreateView");
        return inflater.inflate(R.layout.right_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.d("tjh", "RightFragment onViewCreated");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d("tjh", "RightFragment onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d("tjh", "RightFragment onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d("tjh", "RightFragment onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d("tjh", "RightFragment onStop");
        super.onStop();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        Log.d("tjh", "RightFragment onSaveInstanceState");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onDestroyView() {
        Log.d("tjh", "RightFragment onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("tjh", "RightFragment onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("tjh", "RightFragment onDetach");
        super.onDetach();
    }
}

