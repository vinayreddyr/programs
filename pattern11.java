
import java.util.*;
public class pattern11{
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to print pattern ");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++){
			int start=1;
			if(i%2==0) start=1;
			else start=0;
			for(int j=0;j<i;j++){
				System.out.print(start);
				start=1-start;
			}
			//start=1-start;
			System.out.println("");
		}
	}
}
