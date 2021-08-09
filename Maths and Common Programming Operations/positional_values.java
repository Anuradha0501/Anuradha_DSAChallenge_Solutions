/*Write a program to print positional values of digits.
Ex: - Input: 21463 output: 3, 60, 400, 1000 and 20000.*/

import java.util.Scanner;
class positional_values{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = in.nextInt();
		int t1=0,t2=1;

		System.out.println("Positional Values: ");
		while(n>0){
			t1 = n%10;
		    t1= t1*t2;

		    System.out.println(t1);

		    t2 = t2*10;
		    n = n/10;
   		}
 	}
}