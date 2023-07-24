package com.prueba.ricardo.vererinaria.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class PropietarioDto {
    
    public PropietarioDto(){
        
    }
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellidoPaterno;
    @NotBlank
    private String apellidoMaterno;
}
