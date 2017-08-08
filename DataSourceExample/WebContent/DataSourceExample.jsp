<%@ page import="java.sql.*, javax.sql.*, java.io.*, javax.naming.*" %>
<html>
  <head>
    <title>Data Source Example</title>
  </head>
  <body>
    <h1>Data Source Example</h1>
<%   InitialContext context = new InitialContext();
     DataSource dataSource =                
       (DataSource) context.lookup("java:comp/env/jdbc/TheDS");
     Connection conn = null;
     Statement stmt = null;
     ResultSet rset = null;
     try {
       conn = dataSource.getConnection();
       stmt = conn.createStatement();
       rset = stmt.executeQuery("select * from emp");
       if (rset.next()) {
%>
         <table withd="100%" border="1">
           <tr align="left">
             <th>emp Num</th><th> Emp Name></th>
           </tr>
<%
           
         do {
%>
           <tr>
             <td><%= rset.getString("empno") %></td>
             <td><%= rset.getString("empname") %></td>
             
           </tr>
<%
         } while (rset.next());
%>
         </table>
<%
       } else {
%>
       No results from query
<%
       }
     } catch (SQLException e) {
%>
     <%= e.getMessage() %>
<%
     e.printStackTrace();
     } finally {
       if (rset != null) { rset.close(); }
       if (stmt != null) { stmt.close(); }
       if (conn != null) { conn.close(); }
       if (context != null) { context.close(); }
     }
%>
  </body>
</html>   