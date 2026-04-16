package Excel_practise;

abstract class ATM{
	abstract void deposite(double amount);
	abstract void withdraw(double amount);
	
	public void checkbalance(double balance) {
		System.out.println("Balance in Account"+" "+balance);
		
	}
}
class canaraBankATM extends ATM{
	double balance;
	

	void deposite(double amount) {

		try {
			System.out.println("Depositing  your amount Please wait.......");
			Thread.sleep(3000);
		}
		catch (Exception e) {
			System.out.println("Server Down");
		}
		balance+=amount;
		System.out.println("Deposite Successfully :"+" "+balance);
		
	}
	
	void withdraw(double amount) {
		if(balance>amount)
		{
			try {
				System.out.println("Processing your amount Please wait.......");
				Thread.sleep(3000);
			}
			catch (Exception e) {
				System.out.println("Server Down");
			}
			System.out.println("Withdraw your cash......"+" "+amount);
			balance-=amount;
			System.out.println("Remaining Balance is"+" "+balance);
		}
		
	}
	
}


public class Day3_Abstraction {
	public static void main(String[] args) {
		
		ATM atm=new canaraBankATM();
		
		atm.checkbalance(1000);
		atm.deposite(2000);
		atm.withdraw(1000);
		
				
		
		
	}

}
