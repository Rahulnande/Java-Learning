package Excel_practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Studentsmarks{
	String name;
	float marks;
	
	Studentsmarks(String name,float marks)
	{
		this.name=name;
		this.marks=marks;
	}
}
public class StreamAPI {
	public static void main(String[] args) {
		List<Studentsmarks> a= Arrays.asList(
				new Studentsmarks("Rahul", 50),
				new Studentsmarks("Akash", 70),
				new Studentsmarks("aman", 30)
				);
		
		a.stream().
		filter(o->o.marks>=50).
		map(o->new Studentsmarks(o.name, o.marks+10)).
		forEach(o->System.out.println(o.name + " : " + o.marks)
		);
		
		
	}

}
