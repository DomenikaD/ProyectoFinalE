package ec.edu.ups.ppw.proyectoFinal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Producto {
	
	
/* ~~~~~~~~~~~~~~~~~~~~
		ATRIBUTOS
   ~~~~~~~~~~~~~~~~~~~~ */
	@Id
	@GeneratedValue
	private int codigoProducto;
	
	
	private String nombreProducto;
	private Double precioProducto;
	
	
/* ~~~~~~~~~~~~~~~~~~~~~~
	  GETTERS & SETTERS
   ~~~~~~~~~~~~~~~~~~~~~~ */	
	
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public Double getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(Double precioProducto) {
		this.precioProducto = precioProducto;
	}

	
/* ~~~~~~~~~~~~~~~~~~~~
    	TOSTRING
   ~~~~~~~~~~~~~~~~~~~~ */
	
	@Override
	public String toString() {
		return "Producto [codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto + ", precioProducto="
				+ precioProducto + "]";
	}
	
	
	
	
	

}
