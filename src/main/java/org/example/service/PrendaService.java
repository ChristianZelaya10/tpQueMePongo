package org.example.service;

import org.example.model.Prenda;

public class PrendaService {

    public void crearPrendas(String _tipoPrenda, String _categoria, String _material, String _color, boolean _tieneColorSecundario){

        if(validatePrenda(_tipoPrenda, _categoria, _material, _color)){
            Prenda prenda = new Prenda(_tipoPrenda, _categoria, _material, _color, _tieneColorSecundario);
        }
    }

    private boolean validatePrenda(String _tipoPrenda, String _categoria, String _material, String _color){
        return (_tipoPrenda != null ||  _tipoPrenda != "") && (_categoria != null ||  _categoria != "") && (_material != null ||  _material != "") && (_color != null ||  _color != "");
    }

}
