import java.util.* ;
import java.io.*; 
class power {
	
	public static void main(String args[]) {
		float totalsalary=0;
		Scanner sc=new Scanner(System.in);
		int basic=sc.nextInt();
		char grade=sc.next().charAt(0);
		float hra=(basic/100)*20;
		float da=(basic/100)*50;
		float pf=(basic/100)*11;
		if(grade=='A'){
			totalsalary=basic+hra+da+1700-pf;
			System.out.println(Math.round(totalsalary));
		}
		else if(grade=='B'){
			 totalsalary=basic+hra+da+1500-pf;
			System.out.println(Math.round(totalsalary));
		}
		else
		{
			totalsalary=basic+hra+da+1300-pf;
			System.out.println(Math.round(totalsalary));
		
		}

		
		// Write code here

		
	}
}
	

