package com.prueba.ricardo.vererinaria.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.ricardo.vererinaria.persistence.entity.CitaEnt;


@Repository
public interface CitaEntRepository extends CrudRepository <CitaEnt,Long> {
    
}
