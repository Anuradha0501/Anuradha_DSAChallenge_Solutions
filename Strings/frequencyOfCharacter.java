/*3. Write a program to calculate and print the frequencies of each distinct character
in a string (all the characters in the string are lower case). Ex: - input: “eduhub”, output: b=1, d=1, e=1, h=1, u=2.
*/

import java.util.*;
class frequencyOfCharacter{
   public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str= in.next();
		int[] freq = new int[str.length()];
		int i, j;
		char string[] = str.toCharArray();
		for(i = 0; i <str.length(); i++) {
			freq[i] = 1;
			for(j = i+1; j <str.length(); j++) {
				if(string[i] == string[j]) {
					freq[i]++;
					string[j] = '0';
				}
			}
		}
		System.out.println("Frquencies : ");
		for(i = 0; i <freq.length; i++) {
			if(string[i] != ' ' && string[i] != '0')
				System.out.println(string[i] + "-" + freq[i]);
        }
   }
}