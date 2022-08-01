package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=null;
		FileInputStream fis=null;
		try
		{
			fis=new FileInputStream("D://Test2s.txt");
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

}
