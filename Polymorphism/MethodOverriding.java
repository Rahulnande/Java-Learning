package Excel_practise;
class PaymentGateway {
	public void pay(int amount) {
		System.out.println("pay amount by cash"+" "+amount );
	}
}
class Googlepay extends PaymentGateway{
	public void pay(int amount) {
		System.out.println("pay amount by Googlepay "+" "+amount );
	}
}
class Phonepay extends PaymentGateway{
	public void pay(int amount) {
		System.out.println("pay amount by Phonepay "+" "+amount );
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		PaymentGateway p=new Googlepay();
		p.pay(100);
		
		System.out.println("==================================");
		
		PaymentGateway p1=new Phonepay();
		p1.pay(200);
	}

}
