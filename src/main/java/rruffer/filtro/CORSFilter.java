/*package rruffer.filtro;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class CORSFilter implements ContainerResponseFilter{

	@Override
	public void  filter(ContainerRequestContext request, ContainerResponseContext response) throws IOException {

		request.getHeaders().putSingle("Access-Control-Allow-Origin", "*");
//		request.getHeaders().putSingle("Access-Control-Allow-Credentials", "true");
		request.getHeaders().putSingle("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, OPTIONS");
//		request.getHeaders().putSingle("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, OPTIONS, HEAD");
		request.getHeaders().putSingle("Access-Control-Allow-Headers", "Content-Type");
//		request.getHeaders().putSingle("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With");
		
	}

}*/
