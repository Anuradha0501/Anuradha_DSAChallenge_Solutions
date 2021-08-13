/*10.  Write a program to find the sum of numbers formed by exchanging consecutive digits.
Ex: - input: 2415, output: 42 + 14 + 51 = 107. Input: 24159, output: 42 + 14 + 51 + 95 = 202.*/

import java.util.Scanner;
class sumby_exchanging_consecutiveDigits{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = in.nextInt();
  		int t1=0,t2=0,sum=0;

	  	while(n>2){
		   t1=n%10;
		   n=n/10;
		   t2=n%10;
		   t1=t1*10;
		   sum=sum+t1+t2;
  		}
		System.out.println("Sum : "+sum);
 	}
}