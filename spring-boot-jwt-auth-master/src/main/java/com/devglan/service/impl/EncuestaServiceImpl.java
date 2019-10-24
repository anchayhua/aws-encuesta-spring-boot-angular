package com.devglan.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devglan.dao.EncuestaDao;
import com.devglan.model.Encuesta;
import com.devglan.model.EncuestaDto;
import com.devglan.service.EncuestaService;

@Service(value = "encuestaService")
public class EncuestaServiceImpl implements EncuestaService {

	@Autowired
	private EncuestaDao encuestaDao;

	public List<Encuesta> findAll() {
		List<Encuesta> list = new ArrayList<>();
		encuestaDao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	@Override
	public Encuesta save(EncuestaDto encuestaDto) {
		Encuesta obj = new Encuesta();
		obj.setNombres(encuestaDto.getNombres());
		obj.setApellidos(encuestaDto.getApellidos());
		obj.setEdad(encuestaDto.getEdad());
		obj.setProfesion(encuestaDto.getProfesion());
		obj.setLugartrabajo(encuestaDto.getLugartrabajo());
		obj.setRespuesta(encuestaDto.getRespuesta());

		return encuestaDao.save(obj);
	}
}
