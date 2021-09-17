import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
	This program demonstrates how to take input for an ArrayList 
	and sums the contents if the numbers in an even index are odd as
	well as those numbers in an odd index if they are even.
*/

public class Problem2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String nums;
		ArrayList<Integer> nums2 = new ArrayList<>();
		int total = 0;
		int total1 = 0;
		int total2 = 0;
		int input;
		
		System.out.println("Enter numbers to add to the list or -1 to quit: ");
		System.out.println("Enter -1 on a seperate line if you wish to quit if not enter any other number.");
		
		nums = keyboard.nextLine();
		input = keyboard.nextInt();
		
		String[] arrnums = nums.split(" ");
		
		//while (input != -1)
		//{
			// Converts string to arraylist.
			for (int i = 0; i < arrnums.length; i++)
			{
				nums2.add(Integer.parseInt(arrnums[i]));
			}
		
			// Checks even index for odd number.
			for (int i = 0; i < nums2.size(); i+=2) {
				if (nums2.get(i) % 2 != 0)
				{
					total1 += nums2.get(i);
				}
			}
			// while loop that checks with loop that enter it into arraylist and adds it in through the loop
			// Checks odd index for even number.
			for (int i = 1; i < nums2.size(); i+=2) {
				if (nums2.get(i) % 2 == 0)
				{
					total2 += nums2.get(i);
				}
			}			
				//nums2.get(i);
				total = total1 + total2;
		//}
		System.out.println(nums2 + " -> " + total);
	}
}