import java.sql.*;


public class JdbcExample {
Connection conn;
CallableStatement stmt;
ResultSet res;
	public static void main(String[] args)throws SQLException {
		
JdbcExample ex=new JdbcExample();
ex.openConnection();
ex.displayResult();}
	
public void openConnection() throws SQLException
{
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","saibaba2003")	;
stmt=conn.prepareCall("{call example(?,?)}");
}
public void displayResult()throws SQLException
{
int id=1;
stmt.setInt(1,id);
stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
stmt.execute();
String tmp =stmt.getString(2);


System.out.println("tmp"+tmp);

}}
