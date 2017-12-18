
/*
 * Simple program to calculate the area of the circle
 * based on the radius.
 * @author: Laura Albrant
 */
public class Circle 
{
	static int radius;
	
	//Constructor
	public Circle(int r) 
	{
		radius = r;
	}
	
	public static void setRadius(int r)
	{
		radius = r;
	}
	
	public int getRadius()
	{
		return radius;
	}
	
	public static double getArea(double area)
	{
		area = Math.PI * (double)(radius * radius);
		return area;	
	}

}
