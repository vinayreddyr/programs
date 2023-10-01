import java.util.*;
class SumUsingRecursion{
	
	 int  recurs(int num)
	{
		//int fact;
		if(num==1 || num==0) return num;
		return num*recurs(num-1);
	}


	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		SumUsingRecursion obj=new SumUsingRecursion();
		int res=obj.recurs(num);
		System.out.println(res);
	}
}
		
