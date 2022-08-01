package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileWriter {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		FileReader fr=null;
		FileWriter fw=null;
		
		File f= new File("D://Test.txt");
		try
		{
			fw=new FileWriter();
			fw.write("wlwcome to core java");
		}
		finally
		{
			System.out.println("file writer close");
			fw.close();
		}
		
		
				
	}

	private void close() {
		// TODO Auto-generated method stub
		
	}

	private void write(String string) {
		// TODO Auto-generated method stub
		
	}

}
