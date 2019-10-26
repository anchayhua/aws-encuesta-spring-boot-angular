package com.devglan.model;

public class EncuestaDto {

	private int id;
	private String nombres;
	private String apellidos;
	private int edad;
	private String profesion;
	private String lugartrabajo;
	private String respuesta;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getLugartrabajo() {
		return lugartrabajo;
	}

	public void setLugartrabajo(String lugartrabajo) {
		this.lugartrabajo = lugartrabajo;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

}
