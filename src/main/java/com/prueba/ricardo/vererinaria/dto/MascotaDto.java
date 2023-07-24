package com.prueba.ricardo.vererinaria.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class MascotaDto {


    public MascotaDto(){
        
    }

    @NotBlank
    private  String tipoPaciente;
    
    @NotNull
    private  Date fechaNacimiento;

    @NotNull
    private  PropietarioDto propiertario;

    @NotBlank
    private  String telefono;

}
