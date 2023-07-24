package com.prueba.ricardo.vererinaria.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.ricardo.vererinaria.dto.GenerarCitaDto;
import com.prueba.ricardo.vererinaria.dto.VeterinarioDto;
import com.prueba.ricardo.vererinaria.dto.VeterinarioResponseDto;
import com.prueba.ricardo.vererinaria.service.VertinariaService;

@RestController
@RequestMapping("/veterinaria")
public class VeterinariaController {
    
    @Autowired
    private VertinariaService vertinariaService;

    @PostMapping( value = "/new/veterinario" , consumes =  MediaType.APPLICATION_JSON_VALUE ,produces =   MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public  VeterinarioResponseDto   generateNewColaborator(@RequestBody @Valid VeterinarioDto veterinarioDto ){
        return vertinariaService.newVeterinario(veterinarioDto);
    }

    @PutMapping( value = "/generate/cita" , consumes =  MediaType.APPLICATION_JSON_VALUE ,produces =   MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String processCita ( @RequestParam(name = "cedula",required = true)   String  cedula ,  @RequestBody  @Valid  GenerarCitaDto citaDto ){
        return vertinariaService.processCita(citaDto.cedula(cedula));
    }


}
