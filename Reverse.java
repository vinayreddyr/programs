import java.util.*;
public class Reverse{
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0,rem=0;
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		while(n>0){
			rem=n%10;
			sum=sum*10+rem;
			n /=10;
		}
		System.out.println("Reverse of a given number is"+sum);
		
	}
}

