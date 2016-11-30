package HomeWork.ExtraCredits;
import java.util.Scanner;

/**
 *
 * @author Jeffrey Alhassan
 * @version 1.0
 */

public class RunningTotal {

	/**
	 * product -- store the product of the user input
	 * sum -- store the sum of the user input
	 * totalNumbersEntered -- store the number of times the user inputed something
	 */

	private double product = 1;
	private double sum = 0;
	private int totalNumbersEntered = 0;

	Scanner input = new Scanner(System.in);




	/**
	 * <ul>
	 * <li>Collect data from user,
	 * <li>If the data is the correct data type keep looping
	 * <li>If user inputs wrong data type end loop
	 * </ul>
	 *
	 * @param positive -- check the state of the while loop
	 * @param num -- checks the number the user has entered
	 */
	 
	public void getNumbersFromUser(){

		boolean positive = true;

		while(positive == true)
		{
			// collect and store input for method
			System.out.println("Give me a random positive number");
			int num = input.nextInt(); /// store user input


			if(num > 0)
			{
				sum += num;
				product*=num;
				totalNumbersEntered++;
			}
			else if(num < 0)
			{
				System.out.println("Negative number entered loop end");
				positive = false;

			} /// end of loop

		} /// while loop end
	}


	/**
	 * This method returns the Average number collected from the user
	 * @return Average = sum/totalNumbersEntered
	 */
	public double getAverage(){
		return sum/totalNumbersEntered;
	}

	/**
	 * This method returns the Product from the collected numbers from the user
	 * @return product
	 */
	public double getProduct(){
		return product;
	}


	/**
	 * This method returns the Sum of the collected numbers from the user
	 * @return sum
	 */
	public double getSum(){
		return sum;
	}

}
