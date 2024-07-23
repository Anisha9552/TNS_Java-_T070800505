package session_6;

import java.io.FileOutputStream;
import java.io.IOException;

public class B {
	public static void main (String[]args) throws IOException {
		FileOutputStream fos = null;
		try
		{
			fos = new FileOutputStream("d://mno.txt");
			String str ="Welcome to JSPM Wagholi" ;
			byte[] b = str.getBytes();
			fos.write(b);
		}catch (Exception e) {
			System.out.println();
		}
		finally
		{
			System.out.println("In Finally");
			fos.close();
		}
		
	}

}
//input (in)- read
//