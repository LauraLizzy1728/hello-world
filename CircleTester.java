import java.util.Scanner;

/*
 * This is a simple test program. It tests Circle.java by getting user input.
 * Their input is the radius. Then Circle.java calculates the area and it's 
 * printed in the console.
 * @author: Laura Albrant
 */
public class CircleTester 
{
	public static void main(String[] args) 
	{

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		Circle.setRadius(keyboard.nextInt());
		keyboard.close();
		
		System.out.println("The area of the circle is: " + Circle.getArea(Circle.radius));
		System.out.println("This is a test and i hate it");
	}

}
