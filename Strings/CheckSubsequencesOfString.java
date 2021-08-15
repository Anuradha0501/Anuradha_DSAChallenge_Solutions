/*6.  Write a program to check if a string is a subsequence of another or not.
Ex: - input: s1 = “ABCD” and s2 = “AD”, output: True. Input: s1 = “ABCDE” and s2 = “AED”, output: False.*/

import java.util.*;
class CheckSubsequencesOfString{
	static boolean isSubSequence(String str1, String str2,int m, int n){
		if (m == 0)
			return true;
		if (n == 0)
			return false;
		if (str1.charAt(m - 1) == str2.charAt(n - 1))
			return isSubSequence(str1, str2, m - 1, n - 1);
		return isSubSequence(str1, str2, m, n - 1);
    }
   public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string 1 and 2 : ");
		String str1 = in.next();
		String str2 = in.next();
		int m = str1.length();
        int n = str2.length();
	 	boolean res = isSubSequence(str1, str2, m, n);
			if (res)
				System.out.println("Yes");
			else
		System.out.println("No");
   }
}