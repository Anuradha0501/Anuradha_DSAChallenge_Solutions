/*5.  Write a program to find all subsequences of a string. A string is a subsequence of a given string,
which is formed by removing some characters of the given string. Ex: - input: “abc”, output: a, b, c, ab, bc, ac, abc. Input: “aaa”, output: a, aa, aaa.
*/

import java.util.*;
class SubsequencesOfString{
   public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = in.next();
		int len = str.length();
		int temp = 0;
		String arr[] = new String[len*(len+1)/2];
		for(int i = 0; i < len; i++) {
			for(int j = i; j < len; j++) {
				arr[temp] = str.substring(i, j+1);
				temp++;
			}
		}
		System.out.println("Subsequences of given string are: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
        }
   }
}