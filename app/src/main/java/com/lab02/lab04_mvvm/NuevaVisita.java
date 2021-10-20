package com.lab02.lab04_mvvm;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.lab02.lab04_mvvm.databinding.ActivityMainBinding;
import com.lab02.lab04_mvvm.viewmodel.NuevaVisitaViewModel;

public class NuevaVisita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_visita);
        /*ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_nueva_visita);
        activityMainBinding.setViewModel(new NuevaVisitaViewModel());
        //activityMainBinding.executePendingBindings();*/
    }

}