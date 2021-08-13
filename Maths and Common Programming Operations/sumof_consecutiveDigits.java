/*9. Write a program, which finds the sum of numbers formed by consecutive digits.
Ex: - input: 2415, output: 24 + 41 + 15 = 80. Input: 24159, output: 24 + 41 + 15 + 59 = 139.*/

import java.util.Scanner;
class sumof_consecutiveDigits{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = in.nextInt();
  		int t1=0,t2=0,p=0,sum=0;

		while (n>2){
			t1=n%10;
	   		n=n/10;

	   		t2=n%10;
	   		p=t2*10;

	   		sum=sum+t1+p;
	  	}
		System.out.println("Sum : "+sum);
 	}
}