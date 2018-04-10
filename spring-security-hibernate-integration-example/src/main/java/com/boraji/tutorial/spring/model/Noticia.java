package com.boraji.tutorial.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "noticias")
public class Noticia {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "titulo")
	String titulo;
	
	@Column(name = "contenido")
	String contenido;

	public Noticia() {}
	
	public Noticia(String titulo, String contenido) {
		super();
		this.titulo = titulo;
		this.contenido = contenido;
	}
	
	public Noticia(int id, String titulo, String contenido) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.contenido = contenido;
	}

	//GET Y SET
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	
	

}
