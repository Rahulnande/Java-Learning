package Excel_practise;

class payment{
	
	public void pay(int amount) {
		System.out.println("Paid " + amount + " using cash");
	}
	public void pay(int amount,String Upi) {
		System.out.println("Paid " + amount + " using Upi ID"+Upi);
	}
	public void pay(int amount,String cardtype,String cardnumber) {
	System.out.println("Paid " + amount + " using " + cardtype + " card: " + cardnumber);
    }
	
}

public class Day2_Method_overloading {
	public static void main(String[] args) {
		
		payment p=new payment();
		
		p.pay(500);
		p.pay(1000,"rahul@upi");
		p.pay(1000,"debitcard","1257");
		
	}

}
