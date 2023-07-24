package com.prueba.ricardo.vererinaria.persistence.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "mascota")
public class MascotaEnt {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoPaciente;
    private Date fechaNacimiento;
    
    //@OneToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    @OneToOne(cascade = CascadeType.ALL)
    //@OneToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    @JoinColumn(name = "propietario")
    private  PropiertarioEnt propiertario;
    





}
