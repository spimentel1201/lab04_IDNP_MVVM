package com.lab02.lab04_mvvm.viewmodel;

import android.content.Context;
import android.content.Intent;

import androidx.databinding.BaseObservable;

import com.lab02.lab04_mvvm.MainActivity;
import com.lab02.lab04_mvvm.NuevaVisita;
import com.lab02.lab04_mvvm.RegistroPaciente;

public class MenuViewModel extends BaseObservable {
    Context context;
    public MenuViewModel(Context context) {
        this.context=context;
    }

    public void onRegistrarPacienteClicked(){
        Intent intent = new Intent(context, RegistroPaciente.class);
        context.startActivity(intent);
        //startActivityForResult(intent, 1);
    }

    public void onRegistrarVisitaClicked(){
        Intent intent = new Intent(context, NuevaVisita.class);
        //intent.putExtra("Paciente", paciente);
        context.startActivity(intent);
        //startActivityForResult(intent, 2);
    }
}
