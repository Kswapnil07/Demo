package AssignmentComparatorHashMap;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student>al=new ArrayList<Student>();
		al.add(new Student (101,25,"vijay"));
		al.add(new Student (102,22,"raj"));
		al.add(new Student (103,35,"ram"));
		al.add(new Student (104,21,"ajay"));
		al.add(new Student (101,24,"ketan"));
		al.add(new Student (102,22,"raj"));
		al.add(new Student (103,25,"ram"));
		al.add(new Student (104,35,"ajay"));
		al.add(new Student (107,28,"om"));
		al.add(new Student (109,21,"ramesh"));
		al.add(new Student (108,28,"rahul"));
		al.add(new Student (100,27,"ajay"));
		
		Collections.sort(al, new StudentAge());
		//Collections.sort(al, new StudentRollNo());

		
		System.out.println("name");
		//Collections.sort(al, new StudentName());
		//Collections.sort(al,new StudentRollno);
		System.out.println(al);
	}

}
