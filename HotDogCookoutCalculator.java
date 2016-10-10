<<<<<<< HEAD
/** 
 * BY Jeffrey Alhassan
 * Date: 10/03/2016
=======
/**
 * BY Jeffrey Alhassan
 * Date: 10/09/2016
>>>>>>> origin/master
 * HomeWork 1
 * **/

import java.util.Scanner;

public class HotDogCookoutCalculator {

	public static void main(String args[]){

<<<<<<< HEAD

		String name;

		int people, // variable to store number of people
=======
    // store user name
		String name;

		int people, // store number of people
>>>>>>> origin/master
		hotDog=10,
		buns=8;

		int hd, b; //store calculations

		// colect user input
		Scanner input = new Scanner(System.in);

		System.out.println("What is your name ?");
		name = input.nextLine();

		System.out.println("Hello " + name + ": \nHow many people are coming to the party ?");
		people = input.nextInt();

<<<<<<< HEAD
		///
=======
		/// calculations
>>>>>>> origin/master
		if(people <= 8)
		{
			hd = 10 - people;
			b = 8 - people;
			System.out.println("1 packge of hotdogs and buns");
			System.out.println(hd + " hotdog left over");
			System.out.println(b + " buns left over");
		}
<<<<<<< HEAD
		else
		{

			// calculate required package for hot dog
		    hd = people / hotDog;
			System.out.println(hd + " package of hot dog required");


=======
		 else
		{
      // calculations for HotDog
			// calculate required package for hot dog
		  hd = people / hotDog;
			System.out.println(hd + " package of hot dog required");

>>>>>>> origin/master
			// calculate hot dog reminder
			hd =   people%hotDog;
			System.out.println(hd + " hotdog left over");


<<<<<<< HEAD

=======
      // Calculations for Buns
>>>>>>> origin/master
			// calculate buns reminder
			b = people  / buns ;
			System.out.println(b + "  package of buns required");

			// calculate required package for buns
			b = people % buns;
			System.out.println(b + " buns left over");

		}
<<<<<<< HEAD

=======
    // end of if statement 
>>>>>>> origin/master


	}
}
