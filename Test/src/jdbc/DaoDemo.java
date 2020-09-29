package jdbc;

import java.sql.*;

public class DaoDemo {

	public static void main(String[] args)
	{
	  StudentDao dao= new StudentDao();
  //    Student s1= dao.getStudent(3);
  //    System.out.println(s1.name);
	  
/*	  Student s3 = new Student();
	  s3.id=6;
	  s3.name="Niki";
	  dao.connect();
	  dao.addStudent(s3);  */
	  
	  dao.connect();
	  dao.removeStudent(4);
		
	}

}

class StudentDao
{
	Connection con=null;
	public void connect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    con =DriverManager.getConnection("jdbc:mysql://localhost:3305/test","root","root");

		} catch (Exception e) {
	
			System.out.println(e);
		}
	}
	public Student getStudent(int id) 
	{
		
		try {
			String query= "select name from student where id="+id; 
			Student s= new Student();
			s.id=id;
			
			Statement st= con.createStatement();
			ResultSet rs= st.executeQuery(query);
			rs.next();
			String name= rs.getString(1);
			s.name=name;
			return s;
		} 
		catch ( Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

	public void addStudent(Student s)
	{
		String query="insert into student values(?,?)";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, s.id);
			ps.setString(2, s.name);
			ps.executeUpdate();
		} 
		catch (Exception e) {
			System.out.println(e);
			
		}
		
		
	}
	public void removeStudent(int id)
	{
		
		try {
			String query= "Delete from student where id="+id;
			Student s= new Student();
			s.id=id;
			PreparedStatement ps= con.prepareStatement(query);
			ps.executeUpdate();
		} catch (Exception e) {
		
			System.out.println(e);
		}
		
	}
}


class Student
{
	int id;
	String name;
}
