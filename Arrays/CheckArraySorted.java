/*4. Write a program to check if an array is sorted (whether it be in increasing or decreasing order) or not.*/

import java.util.*;
public class CheckArraySorted {
	public static void checkSorted(int arr[], int n){
		if (arr[0] <= arr[1] &&
			arr[n - 2] <= arr[n - 1])
			System.out.println("Increasing");
		else if (arr[0] >= arr[1] &&
				 arr[n - 2] >= arr[n - 1])
			System.out.println("Decreasing");
		else if (arr[0] <= arr[1] &&
				 arr[n - 2] >= arr[n - 1])
			System.out.println("Increasing then decreasing");
		else
		System.out.println("Decreasing then increasing");
    }
   	public static void main(String args[]){
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter size of array");
	  int size = in.nextInt();
	  System.out.println("Enter elements of array");
	  int arr[] = new int[size];
	  for(int i=0; i<size; i++){
		  arr[i] = in.nextInt();
	  }
      checkSorted(arr, size);

   	}
}