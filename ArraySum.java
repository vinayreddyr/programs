import java.util.*;
class ArraySum{
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements in array: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0,avg=0;
		for(int i=0;i<arr.length;i++){
			sum=arr[i]+sum;
		}
		System.out.println("Sum of elements of given array is:"+sum);
		avg=sum/n;
		System.out.println("Average of elements of given array is:"+avg);
	}
}

		
