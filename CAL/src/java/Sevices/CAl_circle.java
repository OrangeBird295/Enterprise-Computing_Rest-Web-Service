/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sevices;

import java.io.StringWriter;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXB;

/**
 * REST Web Service
 *
 * @author ec
 */
@Path("circle")
public class CAl_circle {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CAl_circle
     */
    public CAl_circle() {
    }

    /**
     * Retrieves representation of an instance of Sevices.CAl_circle
     * @return an instance of java.lang.String
     */
    @GET
    @Path("{r}")
    @Produces("application/xml")
    public String getXml(@PathParam("r")String r) {
        //TODO return proper representation object
        StringWriter writer = new StringWriter();
        double R = Double.parseDouble(r);
        JAXB.marshal("Area is "+ (3.14*R*R) +" Round of circle is "+ (2*3.14*R), writer);
        return writer.toString();
        
    }

    /**
     * PUT method for updating or creating an instance of CAl_circle
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
