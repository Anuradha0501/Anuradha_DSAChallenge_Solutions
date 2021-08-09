/*Write a program, which reads two numbers (assume, both have the same number of digits)
from the user. The program outputs the sum of products of corresponding digits.
Ex: - input: 327 and 539, then output: 3x5 + 2x3 + 7x9 = 84.*/

import java.util.Scanner;
class sumOf_corresponding_digits{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int n1 = in.nextInt();
		System.out.println("Enter second number : ");
		int n2 = in.nextInt();
		int t1=0,t2=0,sop=0;

		while(n1>0 && n2>00){

			t1=n1%10;
		    n1=n1/10;

		    t2=n2%10;
		    n2=n2/10;

		    sop=sop+(t1*t2);
		}
		System.out.println("sum of product of corresponding digits= "+ sop);
 	}
}