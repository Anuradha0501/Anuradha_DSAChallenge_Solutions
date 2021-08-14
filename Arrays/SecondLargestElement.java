/*1. Write a program to find the second largest element in an array.*/

import java.util.*;
public class SecondLargestElement {
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

      for(int i = 0; i<size; i++ ){
         for(int j = i+1; j<size; j++){

            if(arr[i]>arr[j]){
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
         }
      }
      System.out.println("Second second largest number is: "+arr[size-2]);
   }
}