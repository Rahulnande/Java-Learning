package Excel_practise;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SendObject implements Serializable{
	String Name;
	int Salary;
	public SendObject(String name, int salary) {
		super();
		Name = name;
		Salary = salary;
	}
	
	
}

public class Serialization {
	public static void main(String[] args) throws Exception {
		
		SendObject s=new SendObject("Rahul", 100);
		
		FileOutputStream fos=new FileOutputStream("SendObject.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(s);
		
		oos.close();
		fos.close();
		
		System.out.println("Object Serialized");
		
		
	}

}
