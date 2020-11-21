package com.github.juandiii;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.github.juandiii.cdi.Store;
import com.github.juandiii.entity.Coffee;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/coffee")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CoffeeResource {

  @Inject
  Store store;

    @GET
    public List<Coffee> getCoffes() {
      return store.getCoffess();
    }

    @GET
    @Path("/{id}")
    public Coffee getCoffee(@PathParam Integer id) {
      return store.getCoffee(id);
    }
}
