
package br.com.teste.webapi.teste_webapi;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource")
public class MyResource {

    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET 
    @Produces("text/plain")
    public String getIt(@QueryParam("nome") String name, @QueryParam("idade") Long age) {
        return "Hi there! your name is " + name + ", and you have " + age + " years old.";
    }
    
    @POST
    @Consumes("text/plain")
    @Produces("text/plain")
    public String postIt(String text) {
    	return text +"tes";
    }
    
    @PUT
    @Produces("text/plain")
    public String putIt() {
    	return "Hi there, it is a put method";
    }
    
    @DELETE
    @Produces("text/plain")
    public String deleteIt() {
    	return "Hi there, it is a delete method";
    }
}
