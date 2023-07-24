package com.prueba.ricardo.vererinaria.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.ricardo.vererinaria.persistence.entity.VeterinarioEnt;


@Repository
public interface VeterinarioRepository extends CrudRepository <VeterinarioEnt,String>{
    
}
