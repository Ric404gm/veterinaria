package com.prueba.ricardo.vererinaria.dto;

import lombok.Data;

@Data
public class VeterinarioResponseDto {
    
    public VeterinarioResponseDto(){
        
    }
    
    private String id;

    public VeterinarioResponseDto(String id) {
        this.id = id;
    }

    

}
