<%@ page language="java"  import ="com.tutorialspoint.struts2.User" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%>
   
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello World From Struts2 - Spring integration</h1>
${userClass.firstName}

 <h2>Add User</h2>  
    <s:form  action="/user"   method="post">  
    <s:textfield name="userName"  />  
    <s:textfield name="userAge" />  
     
      
    <s:submit  name="submit" value="submit"/>  
 </s:form>  </body>
</html>