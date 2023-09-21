import java.util.*;
public class pattern5{
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to print pattern ");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
}

