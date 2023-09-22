import java.util.*;
public class Increasenumber{
	
	public static void main (String[] args) {
		int n,sum=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		while(n>0){
			rem=n%10;
			rem++;
			sum=sum*10+rem;
			n = n/10;
		}
		n=sum;
		sum=0;
		while(n>0){
			rem=n%10;
			sum=sum*10+rem;
			n = n/10;
		}
		System.out.println("Number after increasing every digit by one is:"+sum);
	}
}
		
