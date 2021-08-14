/*2. Write a program to reverse an array.*/

import java.util.*;
public class reverseArray {
   public static void main(String args[]){
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter size of array");
	  int size = in.nextInt();
	  System.out.println("Enter elements of array");
	  int arr[] = new int[size];
	  for(int i=0; i<size; i++){
		  arr[i] = in.nextInt();
	  }
      int temp;
      int start = 0;
      int end = arr.length - 1;
	  while (start < end){
		  temp = arr[start];
		  arr[start] = arr[end];
		  arr[end] = temp;
		  start++;
		  end--;
       }
       System.out.println("Reverse of given array is: ");
       for (int i = 0; i < size; i++)
	   		System.out.print(arr[i] + " ");

       System.out.println();
   }
}