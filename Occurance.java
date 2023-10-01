import java.util.*;
class Occurance{
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements in array: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a element which you want the number of occurances");
		int x=sc.nextInt();
		int counter=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==x){
				counter++;
			}
		}
		System.out.println("Number of occurances of "+x+ " is "+counter);
	}
}

			
