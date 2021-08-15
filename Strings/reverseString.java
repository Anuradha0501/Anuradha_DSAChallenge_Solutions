/*7.  Write a program to reverse words in a string. Corner Case:
- If there is only one word in a string, then reverse that word, character-wise.
Ex: - input: “Welcome to Eduhub Community”, output: “Community Eduhub to Welcome”. Input: “Hello”, output: “olleH”.
*/

import java.util.*;
import java.util.regex.Pattern;
class reverseString{
   public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = in.next();
		String words[] = str.split("\\s");
		String reversedString = "";
		for (int i = 0; i < words.length; i++) {
			if (i == words.length - 1)
				reversedString = words[i] + reversedString;
			else
				reversedString = " " + words[i] + reversedString;
		}
		System.out.println("Reversed string : " + reversedString);
	}
}