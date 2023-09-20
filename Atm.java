import java.util.Scanner;
public class Atm{
	
	public static void main (String[] args) {
		int balance=10500,withdraw,deposit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Automatic teller machine");
		System.out.println("Enter 1 to withdraw money");
		System.out.println("Enter 2 to deposit money");
		System.out.println("Enter 3 to check balance");
		System.out.println("Enter 4 to exit");
		int n=sc.nextInt();
		switch(n){
			case 1:
			System.out.println("Enter amount to withdraw");
			withdraw=sc.nextInt();
			if(balance>=withdraw){
				balance=withdraw-balance;
				System.out.println("please collect your money");
			}
			else{
				System.out.println("you do not have sufficient balance");
			}
				break;
			case 2:
			System.out.println("Enter amount to deposit");
			deposit=sc.nextInt();
			balance=balance+deposit;
			System.out.println("Your money was deposited succesfully");
			break;
		    
		    case 3:
		    
		    System.out.println("you have a total of "+balance+"in your account");
		    break;
		   
		    case 4:
		    System.exit(0);
	}
}
}
