package org.example.model;

public class Prenda {

    private String tipoPrenda;
    private String categoria;
    private String material;
    private String color;
    private boolean tieneColorSecundario;
    public Prenda(String tipoPrenda, String categoria, String material, String color, boolean tieneColorSecundario) {
        this.tipoPrenda = tipoPrenda;
        this.categoria = categoria;
        this.material = material;
        this.color = color;
        this.tieneColorSecundario = tieneColorSecundario;
    }

    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(String tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isTieneColorSecundario() {
        return tieneColorSecundario;
    }

    public void setTieneColorSecundario(boolean tieneColorSecundario) {
        this.tieneColorSecundario = tieneColorSecundario;
    }

}
