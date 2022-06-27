package br.com.paraizo;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@OpenAPIDefinition(
	    tags = {
	        @Tag(name = "alticci", description = "Sequência Alticci")
	    }, 
	    info = @Info(
	        title = "A sequência Alticci",
	        version = "1.0.0",
	        contact = @Contact(
	            name = "Diego Paraizo Freitas",
	            url = "https://github.com/diegoparaizo")),
	    servers = {
	        @Server(url = "http://localhost:8080")
	    })
public class Descricao {

}
