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
				//Circle
				System.out.println("Circle radius: ");
				radius = validDouble();
				
				// print area
				System.out.println("The Area is: "+ areaCircle(radius));
				System.out.println("=======================");
				break;
				
			case 2:
				//Rectangle
				System.out.println("Rectangle length: ");
				length = validDouble();
				
				System.out.println("Rectangle Width: ");
				width = validDouble();
				
				System.out.println("The Area is: "+ areaRectangle(length,width));
				System.out.println("=======================");
				break;
				
			case 3:
				//Square
				System.out.println("Square side length: ");
				side = validDouble();
				
				System.out.println("The Area is: "+ areaSquare(side));
				System.out.println("=======================");
				break;
				
			case 4:
				//Triangle
				System.out.println("Triangle base: ");
				base = validDouble();
				
				System.out.println("Triangle Height");
				heigth = validDouble();
				
				System.out.println("The Area is: "+ areaTriangle(base,heigth));
				System.out.println("=======================");
				break;
				
			case 5:
				System.out.println("End Program");
				active = false;
				break;
			}// end of switch
			
			
		}// end of while
		
	}// end of main
	
	
	
	
	// return the area of circle
	public static double areaCircle(double radius){
		final double PI = 3.14;
		return radius*=radius *PI;
	}
	
	// return the area of a rectangle
	public static double areaRectangle(double length, double width){
		return length*width;
	}
	
	// return the area of a square
	public static double areaSquare(double side){
		return side*side;
	}
	
	// return the area of a Triangle
	public static double areaTriangle(double base, double height){
		final double half = .5;
		return (base*height)* half;
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
	


}

