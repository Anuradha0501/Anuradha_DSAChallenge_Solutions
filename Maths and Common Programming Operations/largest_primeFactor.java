/* 12. Write a program to find the largest prime factor of a number.
*/

import java.util.Scanner;
class largest_primeFactor{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = in.nextInt();
		int i;
		for (i = 2; i <= n; i++){
			if (n % i == 0){
				n/= i; i--;
			}
		}
    	System.out.println(i);
 	}
}