/*7. Write a program to left rotate an array by:
a. One space
b. “k” spaces
*/

import java.util.*;
public class rotateArray {
	void leftRotate(int arr[], int d, int n){
		for (int i = 0; i < d; i++)
			leftRotatebyOne(arr, n);
		}

		void leftRotatebyOne(int arr[], int n){
			int i, temp;
			temp = arr[0];
			for (i = 0; i < n - 1; i++)
				arr[i] = arr[i + 1];
			arr[n-1] = temp;
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
	  System.out.println("Enter no. of spaces to be shift");
	  int shift = in.nextInt();
	  rotateArray rt = new rotateArray();
	  rt.leftRotate(arr, shift, size);
   	  for (int i = 0; i < size; i++)
	  	System.out.print(arr[i] + " ");
	}
}