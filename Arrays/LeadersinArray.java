/*5. Write a program to find the “Leaders” in an array. P.S.:
Leaders in an array is that element, which is followed by all elements less than that,
to its right. Ex: - arr[] = {7, 10, 4, 10, 6, 5, 2}, output: 10 6 5 2.*/

import java.util.*;
public class LeadersinArray {
   	public static void main(String args[]){
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter size of array");
	  int size = in.nextInt();
	  System.out.println("Enter elements of array");
	  int arr[] = new int[size];
	  for(int i=0; i<size; i++){
		  arr[i] = in.nextInt();
	  }
      int rightMax=arr[size-1];
	  System.out.print(rightMax+" ");
	  for (int i = size-2; i>=0; i--){
		  if(arr[i] > rightMax){
			  rightMax=arr[i];
	  		  System.out.print(" "+rightMax);
	   	   }
   	   }
   	   System.out.println();
	}
}