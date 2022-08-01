package multilevelInheritance;

import java.util.Scanner;

public class son extends father {
	
	void data() {
		System.out.println("hthrh");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		son s=new son();
		s.setdata();
		s.display();
		s.data();
		
		
		}
	}


