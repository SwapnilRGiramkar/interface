//Interface of class 
package interfaces;
public interface Shapes 
{
	double PI_VALUE =22.0/7.0;
	
	void areaOfSquare(int side);
	void perimeterOfSquare(int side);
	void areaOfCircle(double rad);
	
	public abstract void circumferanceOfCircle(double rad);
	
	public static void message()
	{
		System.out.println("Welcome to shape Calculator");
	}
}
//-----------------------------------------------------------------------------
package interfaces;

public class ShapesImp implements Shapes
{
	public void areaOfSquare(int side)
	{
		int area=side*side;
		System.out.println("Area of Square : "+area);
	}
	
	public void perimeterOfSquare(int side)
	{
		int peri=4*side;
		System.out.println("Perimeter of Square : "+peri);
	}
	
	public void areaOfCircle(double rad)
	{
		double area = PI_VALUE*rad*rad;
		System.out.println("Area Of Circle : "+area);
	}
	
	public void circumferanceOfCircle(double rad)
	{
		System.out.println("Perimeter Of Circle : "+2*PI_VALUE*rad);
	}
	
}
//----------------------------------------------------------------------
package interfaces;

public class ShapeDriver
{
	public static void main(String[] args) 
	{
		Shapes s1 =new ShapesImp();
		s1.areaOfSquare(34);
		s1.perimeterOfSquare(34);
		s1.circumferanceOfCircle(12);
		s1.areaOfCircle(45);
		
		Shapes.message();	
	}
}
//-----------------------------------------------------------------------------------
