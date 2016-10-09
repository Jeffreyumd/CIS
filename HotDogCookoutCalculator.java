/** 
 * BY Jeffrey Alhassan
 * Date: 10/03/2016
 * HomeWork 1
 * **/

import java.util.Scanner;

public class HotDogCookoutCalculator {

	public static void main(String args[]){


		String name;

		int people, // variable to store number of people
		hotDog=10,
		buns=8;

		int hd, b; //store calculations

		// colect user input
		Scanner input = new Scanner(System.in);

		System.out.println("What is your name ?");
		name = input.nextLine();

		System.out.println("Hello " + name + ": \nHow many people are coming to the party ?");
		people = input.nextInt();

		///
		if(people <= 8)
		{
			hd = 10 - people;
			b = 8 - people;
			System.out.println("1 packge of hotdogs and buns");
			System.out.println(hd + " hotdog left over");
			System.out.println(b + " buns left over");
		}
		else
		{

			// calculate required package for hot dog
		    hd = people / hotDog;
			System.out.println(hd + " package of hot dog required");


			// calculate hot dog reminder
			hd =   people%hotDog;
			System.out.println(hd + " hotdog left over");



			// calculate buns reminder
			b = people  / buns ;
			System.out.println(b + "  package of buns required");

			// calculate required package for buns
			b = people % buns;
			System.out.println(b + " buns left over");

		}



	}
}
