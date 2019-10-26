package com.devglan.service;

import java.util.List;

import com.devglan.model.Encuesta;
import com.devglan.model.EncuestaDto;

public interface EncuestaService {
	Encuesta save(EncuestaDto encuestaDto);

	List<Encuesta> findAll();
}
