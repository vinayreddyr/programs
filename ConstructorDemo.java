import java.util.*;
class Constructor{
	double width;
	double height;
	double depth;
	public Constructor(){
		System.out.println("Constructor without parameter");
		width=10;
		height=10;
		depth=10;
	}
	public Constructor(int a ,int b,int c){
		System.out.println("Contructor with parameter");
		width = a;
		height = b;
		depth = c;
	}
	public  double volume(){
		return width*height*depth;
	}
}
class ConstructorDemo{
static public void main(String args[]){
	Constructor cuboid1=new Constructor();
	double vol=cuboid1.volume();
	System.out.println(" is:"+vol);
	Constructor cuboid2=new Constructor(8,11,9);
	vol= cuboid2.volume();
	System.out.println("Volume is: "+vol);
}

}
