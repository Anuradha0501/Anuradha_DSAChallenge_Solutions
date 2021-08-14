/*3.  Write a program to remove duplicates from:
a. A sorted array
*/

import java.util.*;
public class removeDuplicatesFromSortedArray {
	static int removeDuplicates(int arr[], int n){
		if (n==0 || n==1)
			return n;

		int[] temp = new int[n];
		int j = 0;
		for (int i=0; i<n-1; i++)
			if (arr[i] != arr[i+1])
				temp[j++] = arr[i];
		temp[j++] = arr[n-1];
		for (int i=0; i<j; i++)
			arr[i] = temp[i];

		return j;
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
	  System.out.println("Array after removing duplicates: ");
      int n = removeDuplicates(arr, size);
	  for (int i=0; i<n; i++)
      	System.out.print(arr[i]+" ");
      System.out.println();
   	}
}