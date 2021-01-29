package com.example.calorias.dao;

import com.example.calorias.dto.InfoIngredienteDTO;

import java.util.Map;

public interface CaloriasDAO {
    InfoIngredienteDTO getIngredienteFromJSON(String name);
}
