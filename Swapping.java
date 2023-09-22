
import java.util.*;
public class Swapping{
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a=sc.nextInt();
		System.out.print("Enter second number: ");
		int b=sc.nextInt();
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping: ");
		System.out.println("first number: "+a);
		System.out.println("second number: "+b);
	}
}
