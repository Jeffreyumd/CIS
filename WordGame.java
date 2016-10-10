/**
 * BY Jeffrey Alhassan
 * Date: 10/03/2016
 * HomeWork 1
 * **/

import java.util.Scanner;

public class WordGame {

	public static void main(String args[]){

		// variable to collect user input
		Scanner input = new Scanner(System.in);

		//variables to store user input string
		String name, college, age, city, profession, animal, petName;


		// collect user name
		System.out.println("What is your name?: ");
		name = input.nextLine();

		// collect user age
		System.out.println("What is your age?: ");
		age = input.nextLine();

		// collect user city
		System.out.println("What City are you from?: ");
		city = input.nextLine();

		// collect user college
		System.out.println("What College do you go?: ");
		college = input.nextLine();

		// collect user profession
		System.out.println("What is you profession?: ");
		profession = input.nextLine();

		// collect user animal
		System.out.println("Do you have any animals?: ");
		animal = input.nextLine();

		// collect user petName
		System.out.println("What is your pets name?: ");
		petName = input.nextLine();


		//print out results
		System.out.println("There once was a person named " + name  + " who lived in a " + city +". \n"
	    + "At the age of " + age + ", " + name + " went to college at " + college + ". \n" + name +
	     " graduated and went to work as a " + profession + ". \n" +
	     "Then, " + name + " adopted a(n) " + animal + " named " + petName + "." + " They both lived happily ever after!" );

		System.out.println("\n"); // make a space between the two paragraph

		//print out second results
		System.out.println("long long ago a a freshman named " + name  + " came from a small town called " + city +". \n"
			    + "he look 20 but his real ages is " + age + ", " + name + " looked like a harvard student but he acutually went to " + college + ". \n" + name +
			     " went back to time with a timemachines to beome a " + profession + ". \n" +
			     "On the way " + name + " found a creature called " + animal + " and named it " + petName + "." + " ever seen people call him the most intresting man in the word" );

	}

}
