package org.example.service;

import org.example.model.Atuendo;
import org.example.model.Prenda;

public class AtuendoService {

    public void agregarPrenda(Prenda nuevaPrenda){
        Atuendo atuendo = new Atuendo();
        atuendo.getPrendas().add(nuevaPrenda);
    }
}
