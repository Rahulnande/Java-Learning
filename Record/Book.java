package Excel_practise;

record Book(String Bookname,int price) {};

public class Record {
	public static void main(String[] args) {
		
		Book b=new Book("JAVA", 300);
		Book b1=new Book("PYTHON", 200);
		
		System.out.println(b.Bookname()+":"+b.price());
		System.out.println(b1.Bookname()+":"+b1.price());
		
	}

}
