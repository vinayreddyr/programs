import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Upper_Lower{
	public static void main(String args[]) throws IOException{
		char m;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any alphabet:");
		m=(char)br.read();
		if(m>=97 && m<=123){
			System.out.println("Lower case");
		}
		else if(m>=63){
			System.out.println("Upper case");
		}
		else if(m>=48 &&  m<=57){
			System.out.println("Digit");
		}
	}
}
