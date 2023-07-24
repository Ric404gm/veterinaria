package com.prueba.ricardo.vererinaria.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class VeterinarioDto {

   
    @NotBlank
    private String cedula ;
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellidoPaterno;
    @NotBlank
    private String apellidoMaterno;


    public VeterinarioDto()
    {

    }

    public VeterinarioDto celula( String cedula) {
        this.cedula = cedula;
        return this;
    }

    public VeterinarioDto nombre( String nombre) {
        this.nombre = nombre;
        return this;
    }
    public  VeterinarioDto apeM( String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
        return this;
    }
    public VeterinarioDto  apeP( String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
        return this;
    }


    


}
