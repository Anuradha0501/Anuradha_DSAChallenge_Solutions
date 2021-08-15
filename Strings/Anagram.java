/*4.  Write a program to check for anagram. Anagram of a word is another word formed by rearranging the letters.
Ex: - input: s1 = “listen” and s2 = “silent”, output: “YES”. Input: s1 = “aab” and s2 = “bab”, output: “NO”.*/

import java.util.*;
class Anagram{
   public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string 1 and 2: ");
		String str1 = in.next();
		String str2 = in.next();
		boolean res = true;
		if (str1.length() != str2.length()) {
			res = false;
		} else {
			char[] a1 = str1.toLowerCase().toCharArray();
			char[] a2 = str2.toLowerCase().toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			res = Arrays.equals(a1, a2);
		}
		if (res) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
        }
   }
}