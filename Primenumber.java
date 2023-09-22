import java.util.*;
public class Primenumber{
	
	public static void main (String[] args) {
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		for(int i=2;i<n;i++){
			if(n%i==0){
				temp=0;
				break;
			}
			else{
				temp=1;
			}
	}
	if(temp==1){
			System.out.println(n+" is prime number");
		}
		else{
		System.out.println(n+" is not a prime number");
	}
}
}
		
