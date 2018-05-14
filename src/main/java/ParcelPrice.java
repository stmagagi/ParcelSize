package main.java;

import javax.ws.rs.Consumes;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("servlets")
public class ParcelPrice {
	
	   @POST
	   @Consumes(MediaType.TEXT_PLAIN)
	   @Produces(MediaType.TEXT_PLAIN)
		@Path("/post")
		public String createProductInJSON(String jsonString) {
		   System.out.println("Test: " + jsonString);
		   String test = "test from server";
			return test;
		}

}
