/*3.  Write a program to remove duplicates from:
b. An unsorted array
*/

import java.util.*;
public class removeDuplicatesFromUnsortedArray {
	static void removeDuplicates(int arr[], int n){
		HashMap<Integer,Boolean> mp = new HashMap<>();
		for (int i = 0; i < n; ++i)
		{
			if (mp.get(arr[i]) == null)
				System.out.print(arr[i] + " ");
			mp.put(arr[i], true);
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
	  System.out.println("Array after removing duplicates: ");
      removeDuplicates(arr, size);

   	}
}