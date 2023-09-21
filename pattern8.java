import java.util.*;
public class pattern8{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		for(int i=0;i<=2*n-1;i++){
		      int stars=i;
		      if(i>n) stars=2*n-i;
			for(int j=1;j<=stars;j++){
				System.out.print("* ");
			}
			System.out.println(" ");
	
  }		
}
}
