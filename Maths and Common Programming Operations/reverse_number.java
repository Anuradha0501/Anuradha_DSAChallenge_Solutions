/*Write a program to reverse a user-input number. Ignore leading zeros.
Ex: - input: 4321, output: 1234. Input: 120, output: 21.*/

import java.util.Scanner;
class reverse_number{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = in.nextInt();
		int rev = 0;
		for(;n != 0; n /= 10) {
			  int digit = n % 10;
			  rev = rev * 10 + digit;
    	}
		System.out.println("Reverse of number is :" + rev);
 	}
}