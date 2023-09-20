import java.util.*;
public class Sumofnumber{
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0,rem=0;
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		while(n>0){
			rem=n%10;
			sum=sum+rem;
			n /=10;
		}
		System.out.println("Sum of digits of a given number: "+sum);
		
	}
}

