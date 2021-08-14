/*10. Write a program to find the maximum sum from a contiguous sub array of a one-dimensional array of numbers.
Ex: - input: arr[] = {-2, -3, 4, -1, -2, 1, 5, -3}, output: 4 + (-1) + (-2) + 1 + 5 = 7.*/

import java.util.*;
public class SumOfContiguousArray {
   	public static void main(String args[]){
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter size of array");
	  int size = in.nextInt();
	  System.out.println("Enter elements of array");
	  int arr[] = new int[size];
	  for(int i=0; i<size; i++){
		  arr[i] = in.nextInt();
	  }
	  int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

	  for (int i = 0; i < size; i++)
	  {
		  max_ending_here = max_ending_here + arr[i];
		  if (max_so_far < max_ending_here)
			  max_so_far = max_ending_here;
		  if (max_ending_here < 0)
			  max_ending_here = 0;
	  }
   	  System.out.println("Maximum contiguous sum is " + max_so_far);
	}
}