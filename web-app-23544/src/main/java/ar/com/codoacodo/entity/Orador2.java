package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class Orador2 {
	//atributos
	Long id;
	String nombre;
	String apellido;
	String mail;
	String tema;
	LocalDate fechaAlta;
	
	//constructor/es
	//usar cuando voy a enviar un objeto a la db
	//insert into orador (campos,..) values(...)
	public Orador2(String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
		init(nombre, apellido, mail, tema, fechaAlta);
		//alt+shit+m
	}
	//alt+shit+s

	public Orador2(Long id, String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
		this.id = id;
		init(nombre, apellido, mail, tema, fechaAlta);
	}
	
	public void init(String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.tema = tema;
		this.fechaAlta = fechaAlta;
	}

	//otra forma de polimorfismo: SOBREESCRITURA, un metodo que existe en una clase base (java.lang.Object) 
	// pero su hijo (Orador) la cambia
	public String toString() {
		return "Orador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", tema="
				+ tema + ", fechaAlta=" + fechaAlta + "]";
	}	
	
	//cambiar un metodo llamado toString() de la clase Object para ver mas lindo en la consola los atributos
	//del objeto
	//alt+shit+s
	
	
}
