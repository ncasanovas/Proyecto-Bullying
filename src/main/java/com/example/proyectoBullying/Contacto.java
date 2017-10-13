package com.example.proyectoBullying;

public class Contacto {
	 
	int id;
	String mail;
	String comentario;
	
	
	public Contacto(int unId, String unMail, String unComentario) {
		this.id = unId;
		this.mail = unMail;
		this.comentario = unComentario;
	
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getComentario() {
		return comentario;
	}
	
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}

