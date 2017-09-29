package com.example.model;

public class Experiencia {

	String usuario;
	String avatar;
	String comentario;
	
	int id;
	
	public Experiencia(String unUsuario, String unAvatar, String unComentario, int unId) {
		this.id = unId;
		this.usuario = unUsuario;
		this.avatar = unAvatar;
		this.comentario = unComentario;
		
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
