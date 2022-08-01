package AssignmentComparatorHashMap;

import java.util.ArrayList;
import java.util.Collections;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> al=new ArrayList<>();
		
		al.add(new Employee(55,"raj","Hr",65000,new Profile("india","maharashtra")));
		al.add(new Employee (12,"ram","Sales",60000,new Profile("india"," goa")));
		al.add(new Employee (10,"omkar","Service",55000,new Profile("india"," odisa")));
		al.add(new Employee (2,"krisha","Hr",50000,new Profile("india","maharashtra")));
		al.add(new Employee (3,"rahul","Development",75000,new Profile("india","up")));
		al.add(new Employee (15,"swapnil","Hr",45000,new Profile("india","gujrat")));
		al.add(new Employee (8,"shri","Sales",40000,new Profile("india","maharashtra")));
		
		Collections.sort(al);
		System.out.println(al);
	}

}
