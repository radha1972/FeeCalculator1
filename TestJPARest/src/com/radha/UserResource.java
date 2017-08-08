package com.radha;
import javax.ws.rs.*;




import javax.ws.rs.core.*;
import javax.ws.rs.core.MediaType;



import javax.persistence.*;

import java.net.URI;
import java.util.*;

import net.sf.json.*;

@Path("/UserService")
@Produces("application/json")

public class UserResource {

/*	public UserResource(UriInfo uriinfo,EntityManager em,String str) {
		// TODO Auto-generated constructor stubg
	}*/
		
		
		 @HttpContext UriInfo uriInfo;    

	       @PersistenceUnit(unitName = "TestJPARest")
	       EntityManagerFactory emf;

	       
	       
	       @SuppressWarnings("unchecked")
		public List<User1> getUsers() {
	    	   
	    	    emf = Persistence.createEntityManagerFactory("TestJPARest");
	    	 EntityManager   em = emf.createEntityManager();
	    	    	    em.getTransaction().begin();
	           List<User1> res= em.createQuery(
	                  "SELECT u from User1 u").getResultList();
	           em.getTransaction().commit();
	           em.close();
	           return res;
	       }
	    
	      /* @UriTemplate("{userid}/")
	       public UserResource getUser(@UriParam("userid") 
	              String userid) {
	           return new UserResource(
	                  uriInfo, emf.createEntityManager(), userid);
	       }*/

	     //  @HttpMethod("GET")@GET
	       
	       
	       
	       
	       
	       
	     
	       
	    /*  public JSONArray getUsersAsJsonArray() {
	           JSONArray uriArray = new JSONArray();
	           UriBuilder ub = null;
	           for (User1 userEntity : getUsers()) {
	               ub = (ub == null) ? 
	                      uriInfo.getBuilder() : ub.clone();
	                      URI userUri = ub.
	                              path(String.valueOf(userEntity.getUserid())).build();
	                              
	                      uriArray.add(userUri);
	           
	       }
	           return uriArray;
	}*/
	       @GET
		     @Path("/users")
	       
	       public String  getAllUsers(){
	      List <User1> user= getUsers();
	      User1 user1=user.get(0);
	      String str=user1.getUserid()+user1.getLdesc()+user1.getSdesc()+user1.getUrl();
	      return str;
	   }	
	       
}


