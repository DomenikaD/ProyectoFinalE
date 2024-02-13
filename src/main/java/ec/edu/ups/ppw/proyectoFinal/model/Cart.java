package ec.edu.ups.ppw.proyectoFinal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Cart {
	
	
/* ~~~~~~~~~~~~~~~~~~~~
	    ATRIBUTOS
   ~~~~~~~~~~~~~~~~~~~~ */
	
	@Id
	@GeneratedValue
	private int codigoCart;
	
	
/* ~~~~~~~~~~~~~~~~~~~~~~
	  GETTERS & SETTERS
   ~~~~~~~~~~~~~~~~~~~~~~ */
	
	public int getCodigoCart() {
		return codigoCart;
	}

	public void setCodigoCart(int codigoCart) {
		this.codigoCart = codigoCart;
	}

	
/* ~~~~~~~~~~~~~~~~~~~~
    	TOSTRING
   ~~~~~~~~~~~~~~~~~~~~ */	
	
	@Override
	public String toString() {
		return "Cart [codigoCart=" + codigoCart + "]";
	}
	
	
	
	
	
	

}
