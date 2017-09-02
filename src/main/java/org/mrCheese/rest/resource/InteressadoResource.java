package org.mrCheese.rest.resource;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.Consumes;

@Path("/interessado")
public class InteressadoResource {

	@GET
	@Produces("text/plain")
	public Response doGet() {
		return Response.ok("method doGet invoked").build();
	}

	@POST
	@Consumes({"text/plain", "application/json"})
	public Response doPost(java.lang.String entity) {
		return Response.created(
				UriBuilder.fromResource(InteressadoResource.class).build()).build();
	}
}