<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="com.radha.Event" %>
       <%@page import="com.radha.EventDao" %>
     <%@page import="java.util.Iterator" %>
     <%@page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%EventDao e=new EventDao();
List <Event> l=e.processEvent();
Iterator itr=l.iterator();
while (itr.hasNext())
{Event ev=(Event)itr.next();%>
<%=ev.EventId %>
<%=ev.EventName %>

<%}%>

</body>
</html>