/*1. Write a program to print the kth digit from last and begin. Ex: - input: 23617 and k = 4, then output: last=3, begin=1.*/

import java.util.Scanner;
class kth_digit{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
  		int n = in.nextInt();
  		int num = n;
  		int k = in.nextInt();
  		int k1 = k;
  		int rev = 0;
  		for(;num != 0; num /= 10) {
		      int digit = num % 10;
		      rev = rev * 10 + digit;
    	}
  		while ((k - 1) > 0 && n > 0){
			n = n / 10;
			k--;
		}
		while ((k1 - 1) > 0 && rev > 0){
					rev = rev / 10;
					k1--;
		}
		System.out.println("from end = "+n % 10+"\nfrom begin = " + rev%10);
 	}
}
