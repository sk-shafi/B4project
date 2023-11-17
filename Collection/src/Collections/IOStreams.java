package Collections;
import java.io.*;
public class IOStreams {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
			FileOutputStream fout=null;
			try
			{
				fout=new FileOutputStream("C:/Users/shafi/OneDrive/Desktop/file.txt");
				String s="file concept";
				byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				fout.close();
			}
	}

}
