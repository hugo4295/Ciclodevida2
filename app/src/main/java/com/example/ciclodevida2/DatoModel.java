package com.example.ciclodevida2;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class DatoModel extends ViewModel {
    List<Datos> lista = new ArrayList<>();

    public DatoModel(){ }

    public DatoModel(List<Datos> lista){
        this.lista = lista;
    }

    public void agregar(Datos datos){
        lista.add(datos);
    }

    public List<Datos> getDatos(){
        return  lista;
    }
}
