package Excel_practise;


class Student{
	
	String name;
}
public class Day1_Datatype_Casting_Primitive_Reference_MemoryAllocation {
	public static void main(String[] args) {
		
		//primitive datatype
		
		int marks=50;
		
		//non-primitive datatype and reference 
		
		Student std=new Student();
		std.name="rahul";
		//typecastin widening 
 
		// typecasting-narrowing
		
		double percentage=marks;
		int rounded=(int)percentage;
		
		
		
		System.out.println(std.name);
        System.out.println(percentage);
        System.out.println(rounded);
    
		
		
	}

}
