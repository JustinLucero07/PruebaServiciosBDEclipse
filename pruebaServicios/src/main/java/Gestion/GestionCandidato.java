package Gestion;

import java.util.List;

import DAO.CandidatoDAO;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import ups.edu.ec.pruebaServicios.Candidato;

@Stateless
public class GestionCandidato {
	@EJB
	private CandidatoDAO candidatoDAO;
	
	public void registrar(Candidato candidato) {
		candidatoDAO.registarCandidato(candidato);
	}
	
	public List<Candidato> listarCandidatos(){
		return candidatoDAO.listarCandidatos();
	}
}
