package main.java;

import java.io.IOException;
import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.net.httpserver.HttpServer;

@SuppressWarnings("restriction")
public class ApiServer { 
	public static void main(String[] args) {
		
		ResourceConfig rc = new PackagesResourceConfig("") ;
		rc.getProperties().put("com.sun.jersey.spi.container.ContainerResponseFilters", 
				"main.java.CORSFilter");
		// TODO Auto-generated method stub
		HttpServer server;
		try {
			server = HttpServerFactory.create( "http://localhost:5555/rest");
			//http://localhost:5555/rest/servlets/hay?
			server.start();
		} catch (IllegalArgumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//JOptionPane.showMessageDialog( null, "Ende" );
		//server.stop( 0 );

	}

}
