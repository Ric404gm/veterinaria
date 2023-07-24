package com.prueba.ricardo.vererinaria.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "veterinario")
public class VeterinarioEnt {


    @Id
    private  String cedula ;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

   
}

