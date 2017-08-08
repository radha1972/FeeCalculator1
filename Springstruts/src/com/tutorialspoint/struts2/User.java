package com.tutorialspoint.struts2;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;  
import com.opensymphony.xwork2.ModelDriven;  
public class User  extends ActionSupport implements ModelDriven<UserBean>{  
	private static final long serialVersionUID = 1L;  
	   
	 @Autowired  
	 private UserBean userBean;   
	
	   public String execute()
	   {
	      return "success";
	   }
	   public String addUser()
	   {
	      return "success";
	   }
	   @Override  
	   public UserBean getModel() {  
	    return userBean;  
	   }  


}
