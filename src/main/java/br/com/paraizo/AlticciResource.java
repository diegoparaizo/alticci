package br.com.paraizo;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.Operation;

@Path("/alticci")
public class AlticciResource {
	
	//injeção do serviço AlticciService
	@Inject
	AlticciService alticciService;
	
	@GET
	@Path("/{n}")
	@Operation(summary = "Retorna o valor da sequencia alticci")
	@Produces(MediaType.APPLICATION_JSON)
	public Integer retornaValorAlticci(@PathParam("n") Integer n) {
		
		//invocação do método de sequencia alticci
		Integer valor = alticciService.sequenciaAlticci(n);
		
		return valor;
	}

}
