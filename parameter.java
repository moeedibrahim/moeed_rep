/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package moeed;

import static java.lang.Math.sqrt;
import java.math.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author Mo3ed
 */
@Path("parameter/{a}/{b}/{c}")
public class parameter {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of parameter
     */
    public parameter() {
    }

    /**
     * Retrieves representation of an instance of moeed.parameter
     * @param a
     * @param b
     * @param c
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson(@PathParam("a") int a,@PathParam("b") int b,@PathParam("c") int c) {
int m= b*b-4*a*c;
int n=(int) sqrt(m);
if (m<0)
    return "impossible";
else
{
        switch(m) {
          case 0 :
          {
             int x1=-b/(2*a); 
              return "{'x1':"+x1+",'x2':"+x1+"}";
          }
          default:
          {int x1=(-b+n)/(2*a);
           int x2=(-b-n)/(2*a);
              return "{'x1':"+x1+",'x2':"+x2+"}";
          }
      } // end of switch      
}       

    }

    /**
     * PUT method for updating or creating an instance of parameter
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
