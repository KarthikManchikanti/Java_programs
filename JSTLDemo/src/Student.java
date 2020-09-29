
public class Student
{
	int rollno;
	String name;
	
	public Student(int rollno, String name)
	{
		this.rollno= rollno;
		this.name=name;
	}
	
	public void setRollno(int rollno)
	{
		this.rollno= rollno;
	}
	
	public int getRollno()
	{
		return rollno;
	}
	public void setName(String name)
	{
		this.name= name;
	}
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return "Student [rollno=" +rollno+ ", name=" +name+ " ]";
	}
}
