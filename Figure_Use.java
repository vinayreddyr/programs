import java.util.*;
class Figure{
	final int length=10;
	final int breadth=9;
	final void area(){
		int a=length*breadth;
		System.out.println("Area is:"+a);
	}
}
class Rectangle extends Figure{
		final void rect(){
			System.out.println("This is a rectangle");
		}
	}
final public class Figure_Use extends Rectangle{
	static public void main(String args[]){
		Figure_Use obj=new Figure_Use();
		obj.rect();
		obj.area();
	}
}

