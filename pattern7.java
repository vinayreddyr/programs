import java.util.*;
public class pattern7{
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to print pattern ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			//spaces
			for(int j=0;j<i;j++){
				System.out.print("  ");
			}
			//stars
			for(int j=1;j<2*n-2*i;j++){
				System.out.print("* ");
			}
			
			//spaces
			for(int j=0;j<i;j++){
				System.out.print("  ");
			}
			System.out.println(" ");
		}
	}
}



