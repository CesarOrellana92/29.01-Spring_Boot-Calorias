package com.example.calorias.controller;

import com.example.calorias.dto.ComidaDTO;
import com.example.calorias.dto.ComidaResponseDTO;
import com.example.calorias.service.CaloriasService;
import com.example.calorias.service.impl.CaloriasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaloriasController {
    @Autowired
    private CaloriasService caloriasService;

    @PostMapping("/api/plato")
    public ComidaResponseDTO getCalorias(@RequestBody ComidaDTO comida){
        return caloriasService.calculate(comida);
    }

}
