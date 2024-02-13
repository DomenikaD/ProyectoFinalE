package ec.edu.ups.ppw.proyectoFinal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Categoria {
	
	
/* ~~~~~~~~~~~~~~~~~~~~
	    ATRIBUTOS
   ~~~~~~~~~~~~~~~~~~~~ */
		
	@Id
	@GeneratedValue
	private int codigoCategoria;
	
	private String nombre;

	
	
/* ~~~~~~~~~~~~~~~~~~~~
    GETTERS & SETTERS
   ~~~~~~~~~~~~~~~~~~~~ */
	public int getCodigoCategoria() {
		return codigoCategoria;
	}

	public void setCodigoCategoria(int codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
/* ~~~~~~~~~~~~~~~~~~~~
    	TOSTRING
   ~~~~~~~~~~~~~~~~~~~~ */	
	
	@Override
	public String toString() {
		return "Categoria [codigoCategoria=" + codigoCategoria + ", nombre=" + nombre + "]";
	}
	
	
	

}
