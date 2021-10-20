package com.lab02.lab04_mvvm.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import androidx.databinding.BaseObservable;

import com.lab02.lab04_mvvm.BR;
import com.lab02.lab04_mvvm.NuevaVisita;
import com.lab02.lab04_mvvm.RegistroPaciente;
import com.lab02.lab04_mvvm.model.Visita;

public class NuevaVisitaViewModel extends BaseObservable {
    private Visita visita;
    private Context context;
    public NuevaVisitaViewModel(Context context) {
        visita = new Visita();
        this.context = context;
    }

    public int getVisitaPeso(){
        return visita.getPeso();
    }

    public int getVisitaTemperatura(){
        return visita.getTemperatura();
    }

    public int getVisitaPresion(){
        return visita.getPresion();
    }
    public int getVisitaNivelSaturacion(){
        return visita.getNivelSaturacion();
    }

    public void setVisitaPeso(int peso) {
        visita.setPeso(peso);
        //notifyPropertyChanged(BR.visitaPeso);
    }
    public void setVisitaTemperatura(int temperatura) {
        visita.setTemperatura(temperatura);
        //notifyPropertyChanged(BR.visitaTemperatura);
    }
    public void setVisitaPresion(int presion) {
        visita.setPresion(presion);
        //notifyPropertyChanged(BR.visitaPresion);
    }
    public void setVisitaNivelSaturacion(int saturacion) {
        visita.setNivelSaturacion(saturacion);
        //notifyPropertyChanged(BR.visitaSaturacion);
    }

    public void onRegistroVisitaClicked(){

        int text_peso = Integer.parseInt(peso.getText().toString());
        int text_temperatura = Integer.parseInt(temperatura.getText().toString());
        int text_presion = Integer.parseInt(presion.getText().toString());
        int text_nivelSaturacion = Integer.parseInt(nivelSaturacion.getText().toString());

        nuevaVisita = new Visita(text_peso, text_temperatura, text_presion, text_nivelSaturacion);
        paciente.setVisita(nuevaVisita);

    };


        Intent intent = new Intent(context, RegistroPaciente.class);
        context.startActivity(intent);
        //startActivityForResult(intent, 1);
    }
}
