package bing;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Mascota{
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	@Persistent
	String nombre;
	@Persistent
	String especie;
	@Persistent
	String edad;
	@Persistent
	String sexo;
	@Persistent
	String mensaje;
	@Persistent
	String dueño;
	
	public Mascota(String n, String e,String ed,String s,String m,String dueño){
		super();
		this.nombre=n;
		this.especie=e;
		this.edad=ed;
		this.sexo=s;
		this.mensaje=m;
		this.dueño=dueño;
	}
	
	
	public String getName(){ 
		return this.nombre;
		}
	public String getEspecie(){
		return this.especie;
		}
	public String getEdad(){
		return this.edad;
		}
	public String getSexo(){
		return this.sexo;
		}
	public String getMensaje(){
		return this.mensaje;
		}
	public String getDueño(){
		return this.dueño;
		}
	
	public void setName(String n){
		this.nombre=n;
		}
	public void setEspecie(String a){
		this.especie=a;
		}
	public void setEdad(String c){
		this.edad=c;
		}
	public void setSexo(String con){
		this.sexo=con;
		}
	public void setMensaje(String con){
		this.mensaje=con;
		}
	public void setDueño(String n){
		this.nombre=n;
		}
	@Override
	public String toString() {
		String resp =  "<td><center>" + "<font color='white'>_</font>" + nombre+"<font color='white'>__</font></td>"
				+"<td><font color='white'>_</font>"+dueño+"<font color='white'>_</font>"
				+"<td><font color='white'>_</font>"+edad+"<font color='white'>_</font>"
				+"<td><font color='white'>_</font>"+sexo+"<font color='white'>_</font>"
				+"<td><font color='white'>_</font>"+mensaje+"<font color='white'>_</font>"
				+"<td><font color='white'>_</font>"+especie+"<font color='white'>_</font>";  
		return resp;
	}
}