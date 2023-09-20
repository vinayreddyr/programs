import java.util.*;
public class Swapnumber {
	
	public static void main (String[] args) {
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:");
		int a=sc.nextInt();
		System.out.println("Enter value of b:");
		int b=sc.nextInt();
		System.out.println("Value of a and b before swaping is :" +a+ " "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping value of a and b is :" +a+ " "+b);
		
		
		
	}
}

