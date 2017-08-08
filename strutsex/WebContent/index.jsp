<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<CENTER>
<H1><bean:message key="form.title"/></H1>

<html:form action="/actions/register">
<bean:message key="form.firstName"/>:
<html:text property="firstName"/><BR>
<bean:message key="form.lastName"/>:
<html:text property="lastName"/><BR>
<bean:message key="form.emailAddress"/>:
<html:text property="emailAddress"/><BR>
<html:submit>
<bean:message key="form.buttonLabel"/>
</html:submit>
</html:form>
</CENTER>

</body>
</html>