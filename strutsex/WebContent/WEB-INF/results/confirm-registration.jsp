<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H1>
<bean:message key="form.title"/>:
<bean:message key="form.successString"/>
</H1>
<UL>
<LI><bean:message key="form.firstName"/>:
<bean:write name="registrationBean"
property="firstName"/>
<LI><bean:message key="form.lastName"/>:
<bean:write name="registrationBean"
property="lastName"/>
<LI><bean:message key="form.emailAddress"/>:
<bean:write name="registrationBean"
property="emailAddress"/>
</UL>
</CENTER>

</body>
</html>