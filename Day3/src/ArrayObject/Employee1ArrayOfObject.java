package ArrayObject;

import java.util.Scanner;

public class Employee1ArrayOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 stud[] = new Employee1[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("enter" + (i + 1) + "Employee details:");
			System.out.println("Id");
			int id = sc.nextInt();
			System.out.println("Name");
			String name = sc.next();
			System.out.println("Dept");
			String dept = sc.next();
			System.out.println("Location");
			String location = sc.next();
			System.out.println("Salary");
			int salary = sc.nextInt();

			stud[i] = new Employee1(id, name, dept, location, salary);
		}
		for (Employee1 a : stud) {
			if (a.dept.equals("hr") && a.salary >= 30000)

				System.out.println(a);
		}
	}

}
