package com.example.calorias.service;

import com.example.calorias.dto.ComidaDTO;
import com.example.calorias.dto.ComidaResponseDTO;

public interface CaloriasService {

    ComidaResponseDTO calculate(ComidaDTO comida);
}
