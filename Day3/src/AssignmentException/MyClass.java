package AssignmentException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyClass {

	 void myMethode1() throws IOException
	{
		this.methode2();
		System.out.println("methode1");
	}
	 void  methode2() throws IOException
	 {
		this.methode3();
		System.out.println("methode2");
	 }
	 void methode3() throws IOException
	 {
		 FileOutputStream fos=null;
			FileInputStream fis=null;
		 
		 try
			{
				fis=new FileInputStream("D://Test.txt");
				int i;
				while((i=fis.read())!=-1)
				{
					System.out.println((char)i);
				}
				System.out.println();
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			finally
			{
				System.out.println("output Stream close");
				fis.close();
			}

	 }
	
		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		MyClass m=new MyClass();
		m.myMethode1();
		
	}

}
