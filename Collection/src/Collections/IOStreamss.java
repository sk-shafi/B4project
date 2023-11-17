package Collections;
import java.io.*;
import java.io.Serializable;
class Emp5 implements Serializable {
	int id;
	String name;
	long mobileno;
	Emp5(int id,String name,long mobileno)
	{
		this.id=id;
		this.name=name;
		this.mobileno=mobileno;
	}
}

public class IOStreamss {

	private static ObjectOutputStream os;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
  Emp5 obj=new Emp5(101,"AAA",93906640);
     FileInputStream fin=null;
     FileOutputStream fout=null;
     os = null;
     try {
    	 fin=new FileInputStream("C:/Users/shafi/OneDrive/Desktop/Sear.txt");
    	 ObjectInputStream oi = new ObjectInputStream(fin);
    	 Emp5 e=(Emp5)oi.readObject();
    	 System.out.println("ID:"+e.id);
    	 System.out.println("Name:"+e.name);
    	 System.out.println("MobileNo:"+e.mobileno);
     }
     catch(Exception e)
     {
    	 e.printStackTrace();
     }
     finally
     {
    	 fin.close();
    	 os.close();
     }
	}

}
