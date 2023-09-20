class Food{
	public static void main(String[] args) {
	String foodType="N";
	int totalBill=0;
	int order=1;
	int distance=7;
	if((foodType=="N" || foodType=="V") && order>=1 && distance>0)
	{
     	if(foodType=="N")
     	{
	        if(distance<=3){
	        totalBill=15*order+0;
	        }
	        else if(distance>3 && distance <=6){
	        totalBill=15*order+(distance-3)*1;
	        }
	        else{
	        totalBill=15*order+(distance-6)*2+3;
	        }
		}
        else
        {
            if(distance<=3){
	        totalBill=12*order+0;
	        }
	        else if(distance>3 && distance <=6){
	        totalBill=12*order+(distance-3)*1;
	        }
	        else{
	        totalBill=12*order+(distance-6)*2+3;
	        }
	}
}
	else
	{
	totalBill=-1;
	}
System.out.println(totalBill);
	
	}
}

