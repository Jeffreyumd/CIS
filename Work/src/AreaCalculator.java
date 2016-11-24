import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaCalculator {
	
	static boolean active = true;
	static int choice;
	static Scanner input = new Scanner(System.in);
	
	static double radius, length, side, width, base, heigth;
	
	public static void main(String[] args){
		
		
		// Print intro
		System.out.println("Area Calculator");
		System.out.println("=======================");
		
		
		//Ask user for action
		while(active == true)
		{
	
			System.out.println("Select a shape: ");
			System.out.println("1. Circle");
			System.out.println("2. Rectangle");
			System.out.println("3. Square");
			System.out.println("4. Triangle");
			System.out.println("5. Exit");

			
			
			// store user input
			choice = input.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Circle radius: ");
				radius = validDouble();
				areaCircle(radius);
				break;
				
			case 2:
				System.out.println("Rectangle length: ");
				length = validDouble();
				
				System.out.println("Rectangle Width: ");
				width = validDouble();
				break;
				
			case 3:
				break;
				
			case 4:
				break;
				
			case 5:
				System.out.println("Program end");
				break;
			}// end of switch
		}// end of while
		
	}
	
	
	/**
	 * The method checks to see if the user input is a valid value.
	 * If the user inputs something other than a double or a integer,
	 * a InputMidmaych occurs 
	 * @return input.nextDouble();
	 */
	public static double validDouble()
	{
		try{
			// return user input
			return input.nextDouble();
		} 
		
		// If user input is not a String
		catch(InputMismatchException e){
			input.next();
			System.out.println("Input not a number !");
			return 0;
		}
		
		// other exception/problem
		catch(Exception e){
			input.next();
			System.out.println(e.getMessage());
			return 0;
		}
	}
	
	// return the area of circle
	public static double areaCircle(double radius){
		return radius;
	}
	
	// return the area of a rectangle
	public static double areaRectangle(int length, int width){
		return length;
	}
	
	public static double areaSquare(int side){
		return side;
	}
	
	public static double areaTriangle(int base, int height){
		return base;
	}
	



}


/**
public static double area_circle( int radius )              // returns the area of a circle
public static int area_rectangle( int length, int width )   // returns the area of a rectangle
public static int area_square( int side )                   // returns the area of a square
public static double area_triangle( int base, int height )  // returns the area of a triangle
*/