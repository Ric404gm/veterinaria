package com.prueba.ricardo.vererinaria.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.ricardo.vererinaria.persistence.entity.MascotaEnt;

@Repository
public interface MascotaRepository  extends CrudRepository <MascotaEnt,Long> {
    
}
