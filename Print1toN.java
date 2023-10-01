import java.util.*;
class Print1toN{
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		Print(n);
	}
	static void Print(int n){
		if(n>0){
			Print(n-1);
			System.out.print(n+" ");
		}
	}
}
