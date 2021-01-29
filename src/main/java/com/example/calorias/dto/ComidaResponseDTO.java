package com.example.calorias.dto;

import java.util.List;

public class ComidaResponseDTO {

    private String nombre;
    private List<IngredienteDTO> listaIngredientes;
    private IngredienteDTO ingredienteConMasCalorias;
    private Double caloriasTotales;

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

    public IngredienteDTO getIngredienteConMasCalorias() {
        return ingredienteConMasCalorias;
    }

    public void setIngredienteConMasCalorias(IngredienteDTO ingredienteConMasCalorias) {
        this.ingredienteConMasCalorias = ingredienteConMasCalorias;
    }

    public Double getCaloriasTotales() {
        return caloriasTotales;
    }

    public void setCaloriasTotales(Double caloriasTotales) {
        this.caloriasTotales = caloriasTotales;
    }
}
