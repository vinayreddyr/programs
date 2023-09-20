import java.util.Scanner;
public class Armstrong{
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0,rem=0;
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int temp=n;
		while(n>0){
			rem=n%10;
			sum=sum+rem*rem*rem;
			n /=10;
		}
		if(temp==sum){
			System.out.println("Given number is a armstrong number ");
		}
		else{
			System.out.println("Given number is not a armstrong number");
		}
		
		
	}
}

