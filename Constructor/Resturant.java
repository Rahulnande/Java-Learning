package Excel_practise;


class Resturant{
	String OrderName;
	double Prize;
	public Resturant(String orderName, double prize) {
	
		OrderName = orderName;
		Prize = prize;
	} 
	public  void DisplayOrder() {
		System.out.println("Order item is"+" "+OrderName);
		System.out.println("Prize item is"+" "+Prize);
	}
	
}
public class Constructor {
	public static void main(String[] args) {
		
		Resturant Kajal=new Resturant("pizza", 500);
		Resturant Rahul=new Resturant("Burger", 700);
		
		Kajal.DisplayOrder();
		System.out.println("===============================");
		Rahul.DisplayOrder();
		
	}

}
