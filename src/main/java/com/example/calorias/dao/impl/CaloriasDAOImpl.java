package com.example.calorias.dao.impl;

import com.example.calorias.dao.CaloriasDAO;
import com.example.calorias.dto.InfoIngredienteDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@Repository
public class CaloriasDAOImpl implements CaloriasDAO {

    @Override
    public InfoIngredienteDTO getIngredienteFromJSON(String name) {
        List<InfoIngredienteDTO> ingredientesLists =  readJSON();

        for(InfoIngredienteDTO ingr : ingredientesLists){
            if(ingr.getName() == name) return ingr;
        }

        return null;
    }

    public List<InfoIngredienteDTO> readJSON() {
        File file = null;
        try{
            file = ResourceUtils.getFile("classpath:static/food.json");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        ObjectMapper objMapper = new ObjectMapper();
        TypeReference<List<InfoIngredienteDTO>> typeRef = new TypeReference<>() {};
        List<InfoIngredienteDTO> listaIngredientes =  null;

        try{
           listaIngredientes = objMapper.readValue(file, typeRef);
        } catch(IOException e){
            e.printStackTrace();
        }

        return listaIngredientes;
    }
}
