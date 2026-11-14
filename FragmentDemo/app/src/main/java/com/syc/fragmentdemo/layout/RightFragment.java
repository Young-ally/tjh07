package com.syc.fragmentdemo.layout;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.syc.fragmentdemo.R;

public class RightFragment extends Fragment {
    @Override
    public void onAttach(@NonNull Context context) {
        Log.d("syc", "RightFragment onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("syc", "RightFragment onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("syc", "RightFragment onCreateView");
        return inflater.inflate(R.layout.right_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.d("syc", "RightFragment onViewCreated");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d("syc", "RightFragment onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d("syc", "RightFragment onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d("syc", "RightFragment onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d("syc", "RightFragment onStop");
        super.onStop();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        Log.d("syc", "RightFragment onSaveInstanceState");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onDestroyView() {
        Log.d("syc", "RightFragment onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("syc", "RightFragment onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("syc", "RightFragment onDetach");
        super.onDetach();
    }
}
