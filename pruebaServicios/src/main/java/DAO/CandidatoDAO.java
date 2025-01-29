package DAO;

import java.util.List;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import ups.edu.ec.pruebaServicios.Candidato;

@Stateless
public class CandidatoDAO {
	@PersistenceContext
	EntityManager em;
	
	public void registarCandidato(Candidato candidato) {
		em.persist(candidato);
	}
	
	public List<Candidato> listarCandidatos(){
		TypedQuery<Candidato> query = em.createQuery("SELECT c from Candidato c",Candidato.class);
		return query.getResultList();	
	}

}
