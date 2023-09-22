import java.util.*;
public class primenumbers{
	
	public static void main (String[] args) {
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter lower limit: ");
		int a=sc.nextInt();
		System.out.print("Enter upper limit: ");
		int b=sc.nextInt();
		System.out.println("prime numbers between you entered limits: ");
		for(int i=a;i<=b;i++){
		for(int j=2;j<i;j++){
			if(i%j==0){
				temp=0;
				break;
			}
			else{
				temp=1;
			}
	}
	if(temp==1){
			System.out.println(i);
		}
		
}
		
}
}
		
