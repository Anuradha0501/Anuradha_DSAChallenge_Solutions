/*11. Write a program to find maximum sum of “k” consecutive elements in the array.
Ex: - input: a[] = {1, 4, 2, 10, 23, 3, 1, 0, 20} and k=4, output: 39
(we get maximum by adding the elements in the sub array {4, 2, 10, 23} of size “k” i.e. 4 here.*/

import java.util.*;
public class maxsumConsecutiveElements {
	static int MaxSum(int[] array, int n){
	    int max = 0;
	    int preSum = 0;
	    for (int i = 0; i <= array.length - n; i++){
	        if (i == 0){
	            for (int j = 0; j < n; j++){
	                max += array[j];
	            }
	            preSum = max;
	        }
	        else{
	            int currentSum = preSum - array[i - 1] + array[i + n - 1];
	            if (currentSum > max){
	                max = currentSum;
	            }
	            preSum = currentSum;
	        }
	    }
	    return max;
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
	  System.out.println("Enter values of k");
	  int k = in.nextInt();
	  System.out.println(MaxSum(arr, k));
	}
}