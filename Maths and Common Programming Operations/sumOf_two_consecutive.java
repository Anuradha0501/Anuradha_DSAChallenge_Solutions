/*Write a program, which will find the sum of products of two consecutive digits.
E.g. input: 23145, then output: 2x3 + 3x1 + 1x4 + 4x5 = 33.*/

import java.util.Scanner;
class sumOf_two_consecutive{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
	   	int n = in.nextInt();
	   	int t1=0, t2=0;
	   	while(n>0){
			t1= (n%10);
			n=n/10;
			t1=t1*(n%10);
			t2=t2+t1;
	   	}
    	System.out.println("Sum of product of consecutive digits =  "+t2);
 	}
}