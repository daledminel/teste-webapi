package br.com.teste.webapi.teste_webapi.war;

import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import br.com.teste.webapi.teste_webapi.exceptions.BaseException;

public class BaseREST {

	private Gson gson = new Gson();
	
	public Response ok(Object object) {
		String json = null;
		
		if (object instanceof List)
			json = gson.toJson(object);
		else if (object instanceof Exception)
			return okWithErrors((Exception) object);
		else
			json = gson.toJson(object);
		
    	return Response.ok(json, MediaType.APPLICATION_JSON).build();
	}
	
	
	public Response okWithErrors(Exception object) {
		BaseException error = new BaseException(object.getMessage());
		String json = gson.toJson(error);
    	return Response.ok(json, MediaType.APPLICATION_JSON).build();
	}
	
}
