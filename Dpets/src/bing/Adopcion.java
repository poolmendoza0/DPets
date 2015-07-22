package bing;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key; 

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Adopcion {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	@Persistent
	String nombre;
	@Persistent
	String apellido;
	@Persistent
	String especie;
	@Persistent
	int edad;
	@Persistent
	String sexo;
	@Persistent
	String descripcion ;
	@Persistent
	String mensaje ;
	
	public Adopcion(String nombre, String apellido,String especie,int edad,String sexo,String descripcion,String mensaje){
		super();
		this.nombre=nombre;
		this.apellido=apellido;
		this.especie=especie;
		this.edad=edad;
		this.sexo=sexo;
		this.descripcion=descripcion;
		this.mensaje=mensaje;
	}
	
	
	public String getNombre(){ 
		return this.nombre;
		}
	public String getApellido(){
		return this.apellido;
		}
	public String getEspecie(){
		return this.especie;
		}
	public int getEdad(){
		return this.edad;
		}

	public String getSexo(){ 
		return this.sexo;
		}
	public String getDescripcion(){ 
		return this.descripcion;
		}
	public String getMensaje(){ 
		return this.mensaje;
		}
	
	
	public void setNombre(String nombre){
		this.nombre=nombre;
		}
	public void setApellido(String apellido){
		this.apellido=apellido;
		}
	public void setEspecie(String especie){
		this.especie=especie;
		}
	public void setEdad(int edad){
		this.edad=edad;
		}
	public void setSexo(String sexo){
		this.sexo=sexo;
		}
	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;
		}
	public void setMensaje(String mensaje){
		this.mensaje=mensaje;
		}
	@Override
	public String toString() {
		String resp =  "<td>"+""+ nombre+", "+apellido+"</td>"+
						"<td>"+ especie+"</td>"+
						"<td>"+ edad+"</td>"+
						"<td>"+ sexo+"</td>"+
						"<td>"+ descripcion+"</td>"+
						"<td>"+ mensaje+"</td>";
		return resp;
	}
}