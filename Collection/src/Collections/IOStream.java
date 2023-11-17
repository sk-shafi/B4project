package Collections;
import java.io.*;
public class IOStream {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream fout=null;
		FileInputStream fin=null;
		try
		{
			fout=new FileOutputStream("C:/Users/shafi/OneDrive/Desktop/file.txt");
			String s="file concept";
			byte b[]=s.getBytes();	
			fout.write(b);
		    fout.close();
		    fin=new FileInputStream("C:/Users/shafi/OneDrive/Desktop/file.txt");
		    int i=0;
		    while((i=fin.read())!=-1)
		    	i=fin.read();
		    {
		    	System.out.println((char)i);
		    }
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			fout.close();
			fin.close();
}
}
}