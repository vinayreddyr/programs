import java.util.Scanner;
public class Armstrongtill1000{
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0,rem=0;
		System.out.print(" Armstrong numbers from 1 to 1000 are:  ");
		//int n=sc.nextInt();
		for(int i=1;i<=1000;i++){
		int n=i;
		while(n>0){
			rem=n%10;
			sum=sum+rem*rem*rem;
			n /=10;
		}
		if(i==sum){
			System.out.print(sum+" ");
		}
		sum=0;
	}
		
	}
}
