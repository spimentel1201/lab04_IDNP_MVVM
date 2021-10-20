package com.lab02.lab04_mvvm;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.lab02.lab04_mvvm.databinding.ActivityMainBinding;
import com.lab02.lab04_mvvm.viewmodel.RegistrarPacienteViewModel;

public class RegistroPaciente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_paciente);
        //ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_registrar_paciente);
        //activityMainBinding.setViewModel(new RegistrarPacienteViewModel(this));
        //activityMainBinding.executePendingBindings();
    }
}