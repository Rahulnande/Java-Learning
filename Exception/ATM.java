package Excel_practise;

class insuffcientbalance extends Exception{
	public insuffcientbalance(String message) {
		super(message);
	}
}
class CanaraATM{
	double balance=3000;
	
	void withdraw(double amount) throws insuffcientbalance{
		System.out.println("Withdaw is in Processing"+" "+amount);
		if (amount>balance)
		{
			//Thread.sleep(3000);
			 throw new insuffcientbalance("Insufficent Balance");
		}
		balance-=amount;
		System.out.println("withdraw your Cash amount"+" "+amount);
		
	}
	void checkbalance()
	{
		System.out.println("Availble Balance is "+" "+balance);
	}
	
}
public class BankingSystem {
	public static void main(String[] args) throws insuffcientbalance, InterruptedException {
		
		CanaraATM atm=new CanaraATM();
		try {
			
			atm.withdraw(5000);
		}
		catch(insuffcientbalance e){
			System.out.println(e.getMessage());
		}
		atm.checkbalance();
		
		
	}

}
