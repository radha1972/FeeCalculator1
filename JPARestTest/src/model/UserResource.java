package model;
import javax.ws.rs.*;


import javax.ws.rs.core.*;


import javax.persistence.*;

import java.net.URI;
import java.util.*;

import javax.ws.rs.HttpMethod;
import net.sf.json.*;

@UriTemplate("/users/")
public class UserResource {

	public UserResource(UriInfo uriinfo,EntityManager em,String str) {
		// TODO Auto-generated constructor stubg
	}
		
		
		 @HttpContext UriInfo uriInfo;    

	       @PersistenceUnit(unitName = "JPARestTest")
	       EntityManagerFactory emf;

	       
	       
	       public List<UserEntity> getUsers() {
	           return emf.createEntityManager().createQuery(
	                  "SELECT u from UserEntity u").getResultList();
	       }
	    
	       @UriTemplate("{userid}/")
	       public UserResource getUser(@UriParam("userid") 
	              String userid) {
	           return new UserResource(
	                  uriInfo, emf.createEntityManager(), userid);
	       }

	       @HttpMethod("GET")
	       @ProduceMime("application/json")
	       public JSONArray getUsersAsJsonArray() {
	           JSONArray uriArray = new JSONArray();
	           UriBuilder ub = null;
	           for (UserEntity userEntity : getUsers()) {
	               ub = (ub == null) ? 
	                      uriInfo.getBuilder() : ub.clone();
	                      URI userUri = ub.
	                              path(String.valueOf(userEntity.getUserid())).build();
	                              
	                      uriArray.add(userUri);
	           
	       }
	           return uriArray;
	}
}


