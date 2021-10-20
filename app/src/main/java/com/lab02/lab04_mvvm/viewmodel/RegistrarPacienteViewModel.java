package com.lab02.lab04_mvvm.viewmodel;
import com.lab02.lab04_mvvm.BR;

import android.content.Context;
import android.content.Intent;

import androidx.databinding.BaseObservable;

import com.lab02.lab04_mvvm.NuevaVisita;
import com.lab02.lab04_mvvm.RegistroPaciente;
import com.lab02.lab04_mvvm.model.Paciente;
import com.lab02.lab04_mvvm.model.Visita;

public class RegistrarPacienteViewModel extends BaseObservable {

    private Paciente paciente;
    private Context context;
    public RegistrarPacienteViewModel(Context context) {
        paciente = new Paciente();
        this.context=context;
    }

    public String getPacienteNombre() {
        return paciente.getNombre();
    }

    public String getPacienteDni() {
        return paciente.getDni();
    }

    public String getPacienteDireccion() {
        return paciente.getDireccion();
    }

    public String getPacienteCorreo() {
        return paciente.getCorreo();
    }

    //public int getVisitaSize(){ return visitas.size(); }

    public void setPacienteNombre(String nombre) {
        paciente.setNombre(nombre);
        //notifyPropertyChanged(BR.pacienteNombre);
    }

    public void setPacienteDni(String dni) {
        paciente.setDni(dni);
        //notifyPropertyChanged(BR.pacienteDni);
    }

    public void setPacienteDireccion(String direccion) {
        paciente.setDireccion(direccion);
        //notifyPropertyChanged(BR.pacienteDireccion);
    }

    public void setPacienteCorreo(String correo) {
        paciente.setCorreo(correo);
        //notifyPropertyChanged(BR.pacienteCorreo);
    }

    /*public void setVisita(Visita visita) {
        visitas.add(visita);
    }

    public Visita getVisita(int i) {
        return visitas.get(i);
    }*/

    public void onRegistroPacienteClicked(){
        Intent intent = new Intent(context, RegistroPaciente.class);
        context.startActivity(intent);
        //startActivityForResult(intent, 1);
    }
}
