package jdbc;

import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3305/test";
		String uname="root";
		String pass="root";
		//String query="select name from student where id=1;";
		String query="select * from student;";
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st= con.createStatement();
        ResultSet rs=st.executeQuery(query);
        while(rs.next())
        {
        String  userdata = rs.getInt(1)+ ":" + rs.getString(2);
        System.out.println(userdata);
        }
    
        st.close();
        con.close(); 
        
        
        
      
	}

}
