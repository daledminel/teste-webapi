
package br.com.teste.webapi.teste_webapi;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import br.com.teste.webapi.teste_webapi.war.BaseREST;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/list")
public class MyResource2 extends BaseREST {
	
	static List<String> list = new ArrayList<>();

    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET
    public Response getIt() {
    	return ok(list);
    }
    
    @POST
    @Consumes("text/plain")
    public Response postIt(String text) {
    	list.add(text);
    	return ok(list);
    }
    
    @PUT
    @Consumes("text/plain")
    public Response putIt(String text) {
    	list.add(text);
    	return ok(list);
    }
    
    @DELETE
    @Consumes("text/plain")
    public Response deleteIt(String text) {
    	try{
    		Integer index = new Integer(text);
    		list.remove(index.intValue());
    		
    	}
    	catch(IndexOutOfBoundsException e) {
    		return ok(e);
    	}
    	catch(NumberFormatException e) {
    		return ok(e);
    	}
    	return ok(list);
    }
}
