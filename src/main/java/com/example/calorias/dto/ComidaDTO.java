package com.example.calorias.dto;

import java.util.List;

public class ComidaDTO {
    private String nombre;
    private List<IngredienteDTO> listaIngredientes;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<IngredienteDTO> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(List<IngredienteDTO> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
}
