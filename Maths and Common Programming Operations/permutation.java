/*15.     Write a program to calculate the permutation of “n” people who can occupy “x”
seats in an empty room. Ex: - input: n=5 and x=4, output: 120 ways.*/

import java.util.*;
class permutation{
	static int fact(int x){
		int f=1,i;
		for(i=1;i<=x;i++){
			f=f*i;
		}
		return f;
	}
	public static void main(String[] args){
		int p,temp,num,d;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no. of persons : ");
		int n = in.nextInt();
		System.out.println("Enter the no. of seats : ");
		int x = in.nextInt();
		if(n < x){
			temp=n;
			n=x;
			x=temp;
		}
		num=fact(n);
		d=fact(n-x);
		p=num/d;
		System.out.println("Total no. of ways are : " + p);
	}
}
