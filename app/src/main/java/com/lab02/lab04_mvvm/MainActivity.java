package com.lab02.lab04_mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;


import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;

import com.lab02.lab04_mvvm.databinding.ActivityMainBinding;
import com.lab02.lab04_mvvm.model.Paciente;
import com.lab02.lab04_mvvm.model.Visita;
import com.lab02.lab04_mvvm.viewmodel.MenuViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(new MenuViewModel(this));
        activityMainBinding.executePendingBindings();
    }

}