import java.util.*;
public class Sumofnumbers{
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int sum=0,x=1;
		while(x<=n){
			sum=sum+x;
			x++;
		}
		System.out.print("Sum of numbers is: "+sum);
	}
}
			
		
