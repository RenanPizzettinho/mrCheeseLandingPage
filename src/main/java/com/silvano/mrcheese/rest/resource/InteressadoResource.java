package com.silvano.mrcheese.rest.resource;

import com.silvano.mrcheese.rest.model.Interessado;
import com.silvano.mrcheese.rest.repository.BasicRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/interessado")
@Produces(MediaType.APPLICATION_JSON)
@Consumes({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON})
public class InteressadoResource {

    @Inject
    private BasicRepository repository;

    @GET
    public Response get() {
        return Response.ok(repository.findAll("from Interessado")).build();
    }

    @GET
    @Path("{id}")
    public Response getById(@PathParam("id") Long id) {
        return Response.ok(repository.find(Interessado.class, id)).build();
    }

    @POST
    public Response post(Interessado interessado) {
        return Response.ok(repository.persist(interessado)).build();
    }
}