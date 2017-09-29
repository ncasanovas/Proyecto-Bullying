package com.example.model;

public class Positivo {

	String usuario;
	String imagen;
	int id;
	
	public Positivo(String unUsuario, String unaImagen, int unId) {
		this.id = unId;
		this.usuario = unUsuario;
		this.imagen = unaImagen;
		
		
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
