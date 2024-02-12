package ec.edu.ups.ppw.proyectoFinal.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Factura {
	
/* ~~~~~~~~~~~~~~~~~~~~
		ATRIBUTOS
   ~~~~~~~~~~~~~~~~~~~~ */
	
	@Id
	@GeneratedValue
	private int codigoFactura;
		
	private Date fechaFactura;
	private double subtotalFactura;
	private double totalFactura;
	
	
/* ~~~~~~~~~~~~~~~~~~~~~~
	  GETTERS & SETTERS
   ~~~~~~~~~~~~~~~~~~~~~~ */	
	
	public int getCodigoFactura() {
		return codigoFactura;
	}


	public void setCodigoFactura(int codigoFactura) {
		this.codigoFactura = codigoFactura;
	}


	public Date getFechaFactura() {
		return fechaFactura;
	}


	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}


	public double getSubtotalFactura() {
		return subtotalFactura;
	}


	public void setSubtotalFactura(double subtotalFactura) {
		this.subtotalFactura = subtotalFactura;
	}


	public double getTotalFactura() {
		return totalFactura;
	}


	public void setTotalFactura(double totalFactura) {
		this.totalFactura = totalFactura;
	}
	
	
	
/* ~~~~~~~~~~~~~~~~~~~~
		TOSTRING
   ~~~~~~~~~~~~~~~~~~~~ */
	
	@Override
	public String toString() {
		return "Factura [codigoFactura=" + codigoFactura + ", numeroFactura=" + ", subtotalFactura="
				+ subtotalFactura + ", totalFactura=" + totalFactura + "]";
	}



}
