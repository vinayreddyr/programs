import java.util.*;
public class pattern6{
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to print pattern ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			//spaces
			for(int j=1;j<n-i;j++){
				System.out.print("  ");
			}
			//stars
			for(int j=1;j<=2*i+1;j++){
				System.out.print("* ");
			}
			
			//spaces
			for(int j=1;j<n-i;j++){
				System.out.print("  ");
			}
			System.out.println("");
		}
	}
}

