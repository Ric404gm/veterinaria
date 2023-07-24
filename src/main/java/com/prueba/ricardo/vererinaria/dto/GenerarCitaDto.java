package com.prueba.ricardo.vererinaria.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public  class GenerarCitaDto {
    
    

    public GenerarCitaDto() {
    
    }


    public GenerarCitaDto cedula(String cedula){
        this.cedulaVeterianrio = cedula;
        return this;
    }


    private String cedulaVeterianrio;

    @NotNull
    private MascotaDto dto;

    private Date fecha;  
}
