/*2.  Write a program to toggle each character in a string. Ex: - input: “EduHub”, output: “eDUhUB”. Input: “int”, output: “INT”.
*/

import java.util.*;
class toggleCharacter{
   public static void main(String args[]){
        int c;
		String str;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string : ");
		str= in.next();
		char a[]=str.toCharArray();
		for(c=0;c<a.length;c++){
			if(a[c]>='A' && a[c]<='Z'){
				a[c]=(char)((int)a[c]+32);
			}
			else if(a[c]>='a' && a[c]<='z'){
				a[c]=(char)((int)a[c]-32);
			}
		}
		System.out.println("String after characters are toggled : ");
		for(c=0;c<a.length;c++)
			System.out.print(a[c]);
		System.out.println();
   }
}