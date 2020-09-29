 package jdbc;
import java.sql.*;

public class InsertDemo {

	public static void main(String[] args) throws Exception
	{

		String url="jdbc:mysql://localhost:3305/test";
		String uname="root";
		String pass="root";
		String query = "insert into student values (5,'uakuhkk')";
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection con= DriverManager.getConnection(url,uname,pass);
		Statement st =con.createStatement();
		int count= st.executeUpdate(query);
		System.out.println(count + "rows afected");
		st.close();
		con.close();
		

	}

}


