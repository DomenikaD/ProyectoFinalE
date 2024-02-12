package ec.edu.ups.ppw.proyectoFinal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class FacturaDetalle {
	
	
/* ~~~~~~~~~~~~~~~~~~~~
	ATRIBUTOS
   ~~~~~~~~~~~~~~~~~~~~ */
	
	@Id
	@GeneratedValue
	private int codigoFD;
	
	
	private String descripcionFD;
	private int cantidadFD;
	private Double precioFD;
	private Double totalFD;
	
	
	
	
/* ~~~~~~~~~~~~~~~~~~~~~~
	  GETTERS & SETTERS
   ~~~~~~~~~~~~~~~~~~~~~~ */	
	
	public int getCodigoFD() {
		return codigoFD;
	}
	public void setCodigoFD(int codigoFD) {
		this.codigoFD = codigoFD;
	}
	public String getDescripcionFD() {
		return descripcionFD;
	}
	public void setDescripcionFD(String descripcionFD) {
		this.descripcionFD = descripcionFD;
	}
	public int getCantidadFD() {
		return cantidadFD;
	}
	public void setCantidadFD(int cantidadFD) {
		this.cantidadFD = cantidadFD;
	}
	public Double getPrecioFD() {
		return precioFD;
	}
	public void setPrecioFD(Double precioFD) {
		this.precioFD = precioFD;
	}
	public Double getTotalFD() {
		return totalFD;
	}
	public void setTotalFD(Double totalFD) {
		this.totalFD = totalFD;
	}


/* ~~~~~~~~~~~~~~~~~~~~
	    TOSTRING
   ~~~~~~~~~~~~~~~~~~~~ */
	
	@Override
	public String toString() {
		return "FacturaDetalle [codigoFD=" + codigoFD + ", descripcionFD=" + descripcionFD + ", cantidadFD="
				+ cantidadFD + ", precioFD=" + precioFD + ", totalFD=" + totalFD + "]";
	}
	
	
	

	
	

}
