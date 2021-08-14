/*9. Write a program to segregate/sort an array of 0’1, 1’s and 2’s without using any of the above sorting algorithms.*/

import java.util.*;
public class SortArrayOf0s1s2s {
	static void sortArray(int arr[], int n){
		int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;
		for (i = 0; i < n; i++) {
			switch (arr[i]) {
			case 0:
				cnt0++;
				break;
			case 1:
				cnt1++;
				break;
			case 2:
				cnt2++;
				break;
			}
		}
		i = 0;
		while (cnt0 > 0) {
			arr[i++] = 0;
			cnt0--;
		}
		while (cnt1 > 0) {
			arr[i++] = 1;
			cnt1--;
		}
		while (cnt2 > 0) {
			arr[i++] = 2;
			cnt2--;
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
	  sortArray(arr,size);
   	  for (int i = 0; i < size; i++)
	  	System.out.print(arr[i] + " ");
	}
}