import java.util.Scanner;

public class Algorithm1 {
	
	private static int[] numArray = new int[50];
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		System.out.println("-----Algorithms-----");
		Scanner input = new Scanner(System.in);
		
		do
		{
			System.out.println("Select your action");
			System.out.println("1: Generate Random numbers");
			System.out.println("2: Arrange the Array (Asc)");
			System.out.println("3: Arrange the Array (Des)");
			System.out.println("4: Find a number");
			System.out.println("5: Exit");
			
			// store user inpout
			 num = input.nextInt();
			
			switch(num)
			{
			
			case 1:
				generateNumber(50);
				printArray();
				break;
				
			case 2:
				selectionSort1();
				printArray();
				break;
				
			case 3:
				selectionSort2();
				printArray();
				break;
				
			case 4:
				System.out.println("What number are you looking for ?");
				int a = input.nextInt();
				numSearch(a); 
				break;
				
			case 5:
				//Exit
				System.out.println("Exit");
				break;
				
			default:
					System.out.println("Invalide input");
				break;
			}
		} while(num!=5);
		
		
	} // end of main
	
	public static void generateNumber(int number)
	{
		for(int i=0; i < number; i++)
		{
			// store random number in array from 0 to 20
			numArray[i] = (int)(Math.random()*100)+1;
			//System.out.println(numArray[i]);
		}	 
	}
	
	public static void printArray()
	{
		for(int i=0; i < numArray.length; i++)
		{
			i+1;
			System.out.println("index: " + i + " " + numArray[i]);
		}
	}
	
	
	public static void selectionSort1()
	{
		int min;
		int temp;
		
		for(int i=0; i < numArray.length; i++)
		{
			min = numArray[i]; // set the first index of array the min
			
			for(int j=i+1; j < numArray.length; j++)
			{
				// if j is less than min, make j the new min
				if(numArray[j] < min)
				{
					// switch i and j 
					min = numArray[j];
					temp = numArray[i];
					numArray[i] = min;
					numArray[j] = temp;
				}
			}// end of for j
		} // end of for i
	}
	
	
	public static void selectionSort2()
	{
		int min;
		int temp;
		
		for(int i=0; i < numArray.length; i++)
		{
			min = numArray[i]; // set the first index of array the min
			
			for(int j=i+1; j < numArray.length; j++)
			{
				// if j is less than min, make j the new min
				if(numArray[j] > min)
				{
					// switch i and j 
					min = numArray[j];
					temp = numArray[i];
					numArray[i] = min;
					numArray[j] = temp;
				}
			}// end of for j
		} // end of for i
	}
	
	
	public static void numSearch(int num)
	{
		boolean found = false;
		int check = 0;
		
		while(found != true)
		{
			for(int i=0; i < numArray.length; i ++)
			{
				if(numArray[i] == num)
				{
					found = true;
					check = 1;
					System.out.println(num + " :is in the Array");
				}
			}// end of for
			
			if(check == 0)
			{
				System.out.println("Number does not exist");
				found = true;
			}
			
		}// end of while 
		
	}
	
	

}
