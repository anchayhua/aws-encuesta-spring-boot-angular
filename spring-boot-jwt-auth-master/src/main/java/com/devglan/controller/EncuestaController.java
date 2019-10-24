package com.devglan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devglan.model.ApiResponse;
import com.devglan.model.Encuesta;
import com.devglan.model.EncuestaDto;
import com.devglan.service.EncuestaService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/encuestas")
public class EncuestaController {

	@Autowired
	private EncuestaService encuestaService;

	@PostMapping
	public ApiResponse<Encuesta> saveEncuesta(@RequestBody EncuestaDto encuestaDto) {
		return new ApiResponse<>(HttpStatus.OK.value(), "Encuesta saved successfully.",
				encuestaService.save(encuestaDto));
	}

	@GetMapping
	public ApiResponse<List<Encuesta>> listEncuesta() {
		return new ApiResponse<>(HttpStatus.OK.value(), "Encuestqa list fetched successfully.",
				encuestaService.findAll());
	}

}
