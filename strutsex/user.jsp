<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://displaytag.sf.net" prefix="display" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>The World's Billionaires 2009</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
    <h2>The World's Billionaires 2009 - Forbes List</h2>
        <display:table export="true"  id="data" 
        			name="sessionScope.UserForm.forbesList" 
        			requestURI="/userAction.do" pagesize="10" >
            <display:column property="rank" title="Rank" sortable="true"   />
            <display:column property="name" title="Name" sortable="true"  />
            <display:column property="age" title="Age" sortable="true"  />
            <display:column property="netWorth" title="Net worth ($BIL)" 
            		sortable="true"  />
        </display:table>
    </body>
</html>