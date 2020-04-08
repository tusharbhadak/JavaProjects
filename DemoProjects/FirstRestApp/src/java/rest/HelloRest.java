/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author root
 */
@Path("restful")
public class HelloRest {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of HelloRest
     */
    public HelloRest() {
    }

    /**
     * Retrieves representation of an instance of rest.HelloRest
     * @return an instance of java.lang.String
     */
    @Path("hello/{first}")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHello(@PathParam("first") String firstname) {
        //TODO return proper representation object
     //   throw new UnsupportedOperationException();
     return "<h2> Hello World Of Rest to "+ firstname+"</h2>";
    }

    @Path("bye")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayBye() {
        //TODO return proper representation object
     //   throw new UnsupportedOperationException();
     return "<h2> Good Bye</h2>";
    }
    /**
     * PUT method for updating or creating an instance of HelloRest
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }
}
