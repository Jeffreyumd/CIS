/**
 * HomeWork-3
 * @author Jeffrey A
 *12/9/2016
 */
public class LoShuMagic {

	/**
	 * check to see if sum of each row,column and diagonal all add up
	 * @param Array
	 * @return boolean
	 */
	public static boolean test(int[][] Array)
	{
		// keep track of false number
		boolean correct = true;
		// store the sums
		int sumA[] = new int[8];

		// check if the array has numbers from 1-9
		// store the sum's in an array
		for(int row=0; row < Array.length; row++)
		{
			for(int col=0; col < Array[row].length; col++)
			{
				 if(Array[row][col] >= 1 & Array[row][col] <= 9)
				 {

					 // colums
					 sumA[0] = Array[0][0] + Array[1][0] + Array[2][0];
					 sumA[1] = Array[0][1] + Array[1][1] + Array[2][1];
					 sumA[2] = Array[0][2] + Array[1][2] + Array[2][2];

					 //rows
					 sumA[3] = Array[0][0] + Array[0][1] + Array[0][2];
					 sumA[4] = Array[1][0] + Array[1][1] + Array[1][2];
					 sumA[5] = Array[2][0] + Array[2][1] + Array[2][2];

					 //diagonals
					 sumA[6] = Array[0][0] + Array[1][1] + Array[2][2];
					 sumA[7] = Array[2][0] + Array[1][1] + Array[0][2];
				 }

				 else
				 { return false;}

			}// end of for
		}// end of for

		// compare the sum's to see if the much up
		for(int i=0; i < sumA.length; i++)
		{
			for(int j=7; j > 0; j--)
			{
				if(sumA[i] != sumA[j])
				{
					System.out.println(i + ":" + sumA[i]);
					System.out.println(i + ":" + sumA[j]);
					correct = false;

				}//end of if
			}//end of for
		}//end of for
		
	   return correct;
	}
}
