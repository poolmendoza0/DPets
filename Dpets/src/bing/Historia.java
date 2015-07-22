package bing;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Historia {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	@Persistent
	int numHistoria;
	@Persistent
	String paciente;
	@Persistent
	String diaAdmin;
	@Persistent
	String propietario;
	@Persistent
	String direccion;
	@Persistent
	int telefono;
	@Persistent
	String especie;
	@Persistent
	int edad;
	@Persistent
	String raza;
	@Persistent
	String sexo;
	
	@Persistent
	String vacunacion;
	@Persistent
	String desparacitacion;
	@Persistent
	String estado;
	@Persistent
	String dietas;
	@Persistent
	String enfermedades;
	@Persistent
	String observaciones;

	
	
	public Historia(int numHistoria,String paciente,String diaAdmin,String propietario,String direccion,int telefono,String especie,int edad,String raza,String sexo,String vacunas,String desparacitaciones,String estado,String enfermedades,String dietas,String observaciones){
		
		this.numHistoria=numHistoria;
		this.paciente=paciente;
		this.diaAdmin=diaAdmin;
		this.propietario=propietario;
		this.direccion=direccion;
		this.telefono=telefono;
		this.especie=especie;
		this.edad=edad;
		this.raza=raza;
		this.sexo=sexo;
		this.vacunacion=vacunas;
		this.desparacitacion=desparacitaciones;
		this.estado=estado;
		this.dietas=dietas;
		this.enfermedades=enfermedades;
		this.observaciones=enfermedades;
		
	}
	
	
	public int getNumHistoria(){ 
		return this.numHistoria;
		}
	public String getPaciente(){
		return this.paciente;
		}
	public String getDiaAdmin(){
		return this.diaAdmin;
		}
	public String getPropietario(){
		return this.propietario;
		}
	public String getDireccion(){
		return this.direccion;
		}
	public int getTelefono(){
		return this.telefono;
		}
	public String getEspecie(){
		return this.especie;
		}
	public int getEdad(){
		return this.edad;
		}
	public String getRaza(){
		return this.raza;
		}
	public String getSexo(){
		return this.sexo;
		}
	
	public String getVacuna(){
		return this.vacunacion;
		}
	public String getDesparacitacion(){
		return this.desparacitacion;
		}
	public String getEstado(){
		return this.estado;
		}
	public String getDietas(){
		return this.dietas;
		}
	public String getEnfemedades(){
		return this.enfermedades;
		}
	public String getObservaciones(){
		return this.observaciones;
		}
	
	
	
	
	public void setNumHistoria(int numHistoria){ 
		 this.numHistoria=numHistoria;
		}
	public void setDiaAdmin(String diaAdmin){
		 this.diaAdmin=diaAdmin;
		}
	public void setPropietario(String propietario){
		 this.propietario=propietario;
		}
	public void setPaciente(String paciente){
		 this.paciente=paciente;
		}
	
	public void setDireccion(String direccion){
		 this.direccion=direccion;
		}
	public void setTelefono(int telefono){
		 this.telefono=telefono;
		}
	public void setEspecie(String especie){
		 this.especie=especie;
		}
	public void setEdad(int edad){
		 this.edad=edad;
		}
	public void setRaza(String raza){
		 this.raza=raza;
		}
	public void setSexo(String sexo){
		 this.sexo=sexo;
		}
	public void setVacuna(String vacunacion){
		 this.vacunacion=vacunacion;
		}
	public void setDesparacitacion(String desparacitacion){
		 this.desparacitacion=desparacitacion;
		}
	public void setEstado(String estado){
		 this.estado=estado;
		}
	public void setDietas(String dietas){
		this.dietas=dietas;
		}
	public void setEnfemedades(String enfermedades){
		 this.enfermedades=enfermedades;
		}
	public void setObservaciones(String observaciones){
		 this.observaciones=observaciones;
		}
	@Override
	public String toString() {
		String resp =  "<td><center>" + "<font color='white'>_</font>" + numHistoria+"<font color='white'>__</font></td>"
				+"<td><font color='white'>_</font>"+paciente+"<font color='white'>_</font>"
				+"<td><font color='white'>_</font>"+diaAdmin+"<font color='white'>_</font>"
				+"<td><font color='white'>_</font>"+propietario+"<font color='white'>_</font>"
				+"<td><font color='white'>_</font>"+direccion+"<font color='white'>_</font>"
				+"<td><font color='white'>_</font>"+telefono+"<font color='white'>_</font>"
				+"<td><font color='white'>_</font>"+especie+"<font color='white'>_</font>"
				+"<td><font color='white'>_</font>"+edad+"<font color='white'>_</font>"
				+"<td><font color='white'>_</font>"+raza+"<font color='white'>_</font>"
				+"<td><font color='white'>_</font>"+sexo+"<font color='white'>_</font>"
				+"<td><font color='white'>_</font>"+vacunacion+"<font color='white'>_</font>"
				+"<td><font color='white'>_</font>"+desparacitacion+"<font color='white'>_</font>"
				+"<td><font color='white'>_</font>"+estado+"<font color='white'>_</font>"
				+"<td><font color='white'>_</font>"+dietas+"<font color='white'>_</font>"
				+"<td><font color='white'>_</font>"+enfermedades+"<font color='white'>_</font>"
				+"<td><font color='white'>_</font>"+observaciones+"<font color='white'>_</font>";  
		return resp;
	}
}
