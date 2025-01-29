import java.util.List;

import Gestion.GestionCandidato;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import ups.edu.ec.pruebaServicios.Candidato;

@Path("/candidatos")
public class CandidatoService {

	@Inject
	private GestionCandidato gestionCandidato;
	
	@POST
	@Produces("application/json")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Candidato candidato) {
		try {
			gestionCandidato.registrar(candidato);
			return Response.ok(candidato).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(503).build();
		}
	}
	
	@GET
	@Produces("application/json")
	public Response listarCandidatos() {
		try {
			List<Candidato> listaCandidatos = gestionCandidato.listarCandidatos();
			return Response.ok(listaCandidatos).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.ok(503).build();
		}
	}
}
