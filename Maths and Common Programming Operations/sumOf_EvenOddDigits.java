/*Write a program to find the sum of even digits and odd digits separately.
Ex: - input: 23617 output: even sum = 2+6 = 8 and odd sum = 3 + 1 + 7 = 11.*/

import java.util.Scanner;
class sumOf_EvenOddDigits{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = in.nextInt();
		int i, odd = 0, even = 0;
		while (n > 0)
		{
			if ((n % 10) % 2 == 0)
				even = even + n % 10;
			else
				odd = odd + n % 10;
				n = n / 10;
		}
		System.out.println("Sum of all odd numbers = " + odd);
		System.out.println("Sum of all even numbers = "+ even);
 	}
}