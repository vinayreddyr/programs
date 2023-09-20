import java.util.Scanner;
public class Evenoddsum{
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,sumE=0,sumO=0;
		System.out.println("Enter the number of elements in array");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if(a[i]%2==0){
				sumE=sumE+a[i];
			}
			else{
				sumO=sumO+a[i];
			}
				
		}
		System.out.println("Sum of even numbers is"+sumE);
		System.out.println("Sum of odd numbers is"+sumO);
				
		
		
		
		
	}
}

