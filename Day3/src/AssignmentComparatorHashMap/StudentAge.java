package AssignmentComparatorHashMap;

import java.util.Comparator;

public class StudentAge implements Comparator<Student>{
	

	public int compare(Student s1,Student s2){ 
		
		if(s1.age==s2.age)  
			return 0;  
			else if(s1.age>s2.age)  
			return 1;  
			else  
			return -1;  
			
//		if(s1.age>s2.age)  
//		return 1;  
//		else if(s1.age<s2.age)  
//		return -1;
//		else
//		return s1.name.compareTo(s1.name); 
	}
}
