import java.util.*;
class PalindromeString {
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String a,b="";
		System.out.print("Enter a String :");
		a=sc.nextLine();
		int n=a.length();
		for(int i=n-1;i>=0;i--){
			b=b+a.charAt(i);
		}
		if(b.equalsIgnoreCase(a)){
			System.out.println("Given string is a palindrome");
		}
		else{
			System.out.println("Given string is not a palindrome");
		}
	}
}
