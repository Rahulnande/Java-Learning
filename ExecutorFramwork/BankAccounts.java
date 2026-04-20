package Excel_practise;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class BankAccounts{
    private String Username;
    private int balance;
	public BankAccounts(String Username, int balance) {
		super();
		this.Username = Username;
		this.balance = balance;
	}
	  synchronized void deposite(int amount) {
	    	if(balance>0)
	    	{
	    		balance+=amount;
	    		System.out.println(Username+" "+"amount deposite is Succesfully "+" "+amount);
	    		
	    		
	    	}else {
	    		System.out.println(" Enter amount greater then 0");
	    	}
	    }
	  synchronized void withdraw(int amount) {
	        System.out.println(Username + " trying to withdraw " + amount);

	        if (balance >= amount) {
	            try { Thread.sleep(3000); } catch (Exception e) {}

	            balance -= amount;
	            System.out.println(Username + " withdrew " + amount +
	                    " | Remaining: " + balance);
	        } else {
	            System.out.println(Username + " insufficient balance!");
	        }
	    }
  
    public int getBalance() {
        return balance;
    }
    
}

public class ExecutorFramwork {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		BankAccounts acc1=new BankAccounts("Rahul",1000);
		BankAccounts acc2=new BankAccounts("kajal",1000);
		
		ExecutorService executor=Executors.newFixedThreadPool(2);
		
		Future<?> firstthread=executor.submit(()->{
			acc1.deposite(1000);
			acc1.withdraw(500);
			return null;
		});
		Future<?> showbalance=executor.submit(()->{
			acc1.deposite(1000);
			return acc1.getBalance();
			
		});
		System.out.println("Rahul Final Balance (Future): " + showbalance.get());
		firstthread.get();
		
System.out.println("============================================");
		Future<?> secoundthread=executor.submit(()->{
			acc2.deposite(2000);
			acc2.withdraw(1000);
		});
		Future<?> showbalance2=executor.submit(()->{
			acc2.deposite(1000);
			
			return acc1.getBalance();
			
			
		});
		System.out.println("Kajal Final Balance (Future): " + showbalance.get());
		secoundthread.get();
		
	
		
		// ===== Shutdown =====
		executor.shutdown();
		
		
	}

}
