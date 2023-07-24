package com.prueba.ricardo.vererinaria.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.ricardo.vererinaria.persistence.entity.PropiertarioEnt;

@Repository
public interface PropiertrioRepository extends CrudRepository <PropiertarioEnt, Long>{
    
}
