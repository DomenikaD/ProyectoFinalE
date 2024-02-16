package ec.edu.ups.ppw.proyectoFinal.dao;

import java.util.List;

import ec.edu.ups.ppw.proyectoFinal.model.Cliente;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class ClienteDao {
	
	@PersistenceContext
	private EntityManager em;
	
	
	
	/*
	      Guardar Cliente
	 */
	public void insert (Cliente cliente) {
		em.persist(cliente);
		
	}
	
	
	/*
	 	  Actualizar Cliente
	 */
	public void update (Cliente cliente) {
		em.merge(cliente);
	}

	
	
	/*
	 	   Borrar Cliente
	 */
	public void remove (int id) {
		Cliente cliente = em.find(Cliente.class, id);
		em.remove(cliente);
	}
	
	
	
	/*
	 	  Buscar Cliente
	 */
	public Cliente read (int id) {
		Cliente cliente = em.find(Cliente.class, id);
		return cliente;
	}
	
	
	
	public List<Cliente> getAll(){
		String jpql = "SELECT c FROM Cliente c";
		Query q = em.createQuery(jpql, Cliente.class);
		return q.getResultList();
	}
	
	
	/*
	 	  Buscar cliente por su numero de Cedula
	 */
	public Cliente getClientebyCedula (String cedula) {
		String jpql = "SELECT c FROM Cliente c WHERE c.cedulaClient =: cedula";
		Query q = em.createQuery(jpql, Cliente.class);
		q.setParameter("cedula", cedula);
		
		List<Cliente> clientes = q.getResultList();
		if (clientes.size()>0)
			return clientes.get(0);
		return null;
		
	}
}
