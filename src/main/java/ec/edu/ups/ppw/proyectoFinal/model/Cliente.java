package ec.edu.ups.ppw.proyectoFinal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Cliente {
	
	
	/* ~~~~~~~~~~~~~~~~~~~~
    		ATRIBUTOS
	   ~~~~~~~~~~~~~~~~~~~~ */
		@Id
		@GeneratedValue
		private int id;
		
		private String cedulaCliente;
		private String nombreCliente;
		private String apellidoCliente;
		private String correoCliente;
		private String direccionCliente;
		private String passwordCliente;
		
		

	/* ~~~~~~~~~~~~~~~~~~~~~~
	 	  GETTERS & SETTERS
	   ~~~~~~~~~~~~~~~~~~~~~~ */
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCedulaCliente() {
			return cedulaCliente;
		}
		public void setCedulaCliente(String cedulaCliente) {
			this.cedulaCliente = cedulaCliente;
		}
		public String getNombreCliente() {
			return nombreCliente;
		}
		public void setNombreCliente(String nombreCliente) {
			this.nombreCliente = nombreCliente;
		}
		public String getApellidoCliente() {
			return apellidoCliente;
		}
		public void setApellidoCliente(String apellidoCliente) {
			this.apellidoCliente = apellidoCliente;
		}
		public String getCorreoCliente() {
			return correoCliente;
		}
		public void setCorreoCliente(String correoCliente) {
			this.correoCliente = correoCliente;
		}
		public String getDireccionCliente() {
			return direccionCliente;
		}
		public void setDireccionCliente(String direccionCliente) {
			this.direccionCliente = direccionCliente;
		}
		public String getPasswordCliente() {
			return passwordCliente;
		}
		public void setPasswordCliente(String passwordCliente) {
			this.passwordCliente = passwordCliente;
		}
		
		
		/* ~~~~~~~~~~~~~~~~~~~~
	 		     ToSTRING
   		   ~~~~~~~~~~~~~~~~~~~~ */	
		
		@Override
		public String toString() {
			return "Cliente [id=" + id + ", cedulaCliente=" + cedulaCliente + ", nombreCliente=" + nombreCliente
					+ ", apellidoCliente=" + apellidoCliente + ", correoCliente=" + correoCliente
					+ ", direccionCliente=" + direccionCliente + ", passwordCliente=" + passwordCliente + "]";
		}


		
		
		
		
		
}
