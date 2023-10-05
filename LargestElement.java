import java.util.*;
class LargestElement{
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements in array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
			System.out.println("Maximum value is: "+max);
		
	}
}
		
