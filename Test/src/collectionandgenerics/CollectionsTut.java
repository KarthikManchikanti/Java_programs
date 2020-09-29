package collectionandgenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studs= new ArrayList<>();
		studs.add(new Student(1,55));
		studs.add(new Student(2,95));
		studs.add(new Student(3,35));
		studs.add(new Student(4,45));
		studs.add(new Student(5,85));
		
/*		Collections.sort(studs, (s1,s2) ->{
			return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;
			
			 
		}); */
		
		Collections.sort(studs);
		
		for(Student s: studs)
		{
			System.out.println(s); 
		}
		
 
	}

}

class Student implements Comparable<Student>
{
	int rollno;
	int marks;
	
	public Student(int rollno, int marks)
	{
		this.rollno=rollno;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}
	
	public int compareTo(Student s)
	{
		return this.marks>s.marks?-1:this.marks<s.marks?1:0;
	}
}
