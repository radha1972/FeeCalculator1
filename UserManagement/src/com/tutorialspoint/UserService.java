package com.tutorialspoint;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/UserService")
public class UserService {

   UserDao userDao = new UserDao();

   @GET
   @Path("/users")
   @Produces(MediaType.TEXT_PLAIN)
   public String  getUsers(){
      List <User> user= userDao.getAllUsers();
      User user1=user.get(0);
      String str=user1.getId()+user1.getName()+user1.getProfession();
      return str;
   }	
}