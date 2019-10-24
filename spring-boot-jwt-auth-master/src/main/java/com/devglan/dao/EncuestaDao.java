package com.devglan.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devglan.model.Encuesta;

@Repository
public interface EncuestaDao extends CrudRepository<Encuesta, Integer> {

}
