/*11.     Write a program to find the number of times x digit occurs in a given input.
Ex: - input: 948932 and x = 9, output: 2.*/

import java.util.Scanner;
class noOF_occurences{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = in.nextInt();
		System.out.println("Enter digit to find its occurences : ");
		int d = in.nextInt();
  		int cnt = 0;
		while (n > 0){
			if(n % 10 == d)
				cnt = cnt +1;
			else
				cnt = cnt;
			n = n / 10;
    	}
    	System.out.println(cnt+" times " +d+" occurs in number.");
 	}
}