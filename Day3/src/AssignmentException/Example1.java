package AssignmentException;

//import java.util.InputMismatchException;

public class Example1 {

	 void arrayElement(int arr[],int i) 
	{
		System.out.println("element of index :"+arr[i]);
	}
	 void StringElement(String s,int i)
	{
		System.out.println("char at the index of string:"+s.charAt(i));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example1 e=new Example1();
		
		int arr[]= {10,20,30,40,50};
		
		try {
			e.StringElement("java", 3);
			e.arrayElement(arr, 6);	
		}

		catch ( ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException b) {
			System.out.println(b);
				
		}
		
		
	   }
	}


