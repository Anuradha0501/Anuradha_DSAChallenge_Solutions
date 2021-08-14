/*6. Write a program to list down the frequencies of all distinct elements from:
a. A sorted array
*/

import java.util.*;
public class frequenciesOfDistinct {
	static void Distinct(int arr[], int n){
		for (int i = 0; i < n; i++){
			int j;
			for (j = 0; j < i; j++)
			if (arr[i] == arr[j])
				break;
			if (i == j)
			System.out.print( arr[i] + " ");
		}
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
	  Distinct(arr, size);
	  System.out.println();
	}
}