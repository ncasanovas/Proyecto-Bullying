package com.example.model;

public class Centro {
	 
	int id;
	String nombre;
	String descripcion;
	String direccion;
	
	public Centro(int unId, String unNombre, String unaDescripcion, String unaDireccion) {
		this.id = unId;
		this.nombre = unNombre;
		this.descripcion = unaDescripcion;
		this.direccion = unaDireccion;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}

