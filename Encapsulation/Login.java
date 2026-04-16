package Excel_practise;

import java.util.Scanner;

class user{
	private String Username;
	private String Password;
	
	public void setusername(String Username)
	{
		this.Username=Username;
	}
	public String getusername()
	{
		return Username ;
	}
	
	public void setpassword(String Password)
	{
		if(Password.length()>=6)
		{
			this.Password=Password;
			System.out.println("Password Set Succesfully");
		}
		else {
			System.out.println("Password is greater then 6 digit");
		}
		
	}
	public String getpassword()
	{
		return Password ;
	}
	public void login(String Username,String Password) {
		if(this.Username.equals(Username)&& this.Password.equals(Password))
		{
			System.out.println("Login Successfully");
		}
		else {
			System.out.println("Error give proper Username and Password");
		}
		
	}
	
	
}
public class Day3_Encapsulation {
	public static void main(String[] args) {
		user u=new user();
		u.setusername("rahul");
		String getusername=u.getusername();
		u.setpassword("rahul123");
		String getpassword=u.getpassword();
		
		Scanner sc=new Scanner(System.in);
//		String username=sc.nextLine();
//		String password=sc.nextLine();
		try {
			System.out.println("=====Welcome to my World=========");
			System.out.println("Enter username :");
			String usernames=sc.nextLine();
			System.out.println("Enter Passsword :");
			String passwords=sc.nextLine();
			Thread.sleep(1000);
			u.login(usernames, passwords);
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
