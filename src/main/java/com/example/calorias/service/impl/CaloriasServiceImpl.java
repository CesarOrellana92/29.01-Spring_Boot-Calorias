package com.example.calorias.service.impl;

import com.example.calorias.dao.impl.CaloriasDAOImpl;
import com.example.calorias.dto.ComidaDTO;
import com.example.calorias.dto.ComidaResponseDTO;
import com.example.calorias.dto.IngredienteDTO;
import com.example.calorias.service.CaloriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CaloriasServiceImpl  implements CaloriasService {

    @Autowired
    private CaloriasDAOImpl repository;

    @Override
    public ComidaResponseDTO calculate(ComidaDTO comida) {
        ComidaResponseDTO response = new ComidaResponseDTO();
        Map<IngredienteDTO, Double> caloriasPorIngrediente;

        response.setNombre(comida.getNombre());

        for (IngredienteDTO i : comida.getListaIngredientes()){
            //HACER
        }

        return null;
    }
}
