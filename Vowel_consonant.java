import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Vowel_consonant{
	public static void main(String args[]) throws Exception{
		char n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a character you want to check");
		n=(char)br.read();
		switch(n){
			case 'a':
			System.out.println("The given character "+n+" is vowel");
			break;
			
			case 'e':
			System.out.println("The given character "+n+" is vowel");
			break;
			
			case 'i':
			System.out.println("The given character "+n+" is vowel");
			break;
			
			case 'o':
			System.out.println("The given character "+n+ " is vowel");
			break;
			
			case 'u':
			System.out.println("The given character "+n+" is vowel");
			break;
			
			default:
			System.out.println("The given character "+n+" is consonant");
		} 
	}
}
			
			
			
			
			
			
			
