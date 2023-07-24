package com.prueba.ricardo.vererinaria.service;

import com.prueba.ricardo.vererinaria.dto.GenerarCitaDto;
import com.prueba.ricardo.vererinaria.dto.VeterinarioDto;
import com.prueba.ricardo.vererinaria.dto.VeterinarioResponseDto;

public interface VertinariaService {


    VeterinarioResponseDto newVeterinario( VeterinarioDto veterinarioDto);
    String  processCita( GenerarCitaDto citaDto );
    
}
