package bing;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Trabajador {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private String nombre;
	@Persistent
	private String correo;
	@Persistent
	private String direccion;
	
	@Persistent
	private int telefono;
	@Persistent
	private String especial;
	


	public Trabajador(String nombre, String correo,String direccion,int telefono, String especialidad) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.direccion= direccion;
		this.telefono=telefono;
		this.especial=especialidad;
	}
	public String getNom() {
		return nombre;
	}
	public void setNom(String nombre) {
		nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		 this.correo = correo;
	}
	public String  getDireccion() {
		return this.direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}
	public int  getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono=telefono;
	}
	public String  getEspecialidad() {
		return especial;
	}
	public void setEspecialidad(String especialidad) {
		this.especial=especialidad;
	}
	public Key getKey() {
		return key;
	}
	
	@Override
	public String toString() {
		String resp = "<td><center>"+""+nombre+"</center></td>"
	+"<td><center>"+""+correo+"</center></td>"
	+"<td><center>"+direccion+"</center></td>"
	+"<td><center>"+telefono+"</center></td>"
	+"<td><center>"+especial+"</center></td>";  
		return resp;
	}
}