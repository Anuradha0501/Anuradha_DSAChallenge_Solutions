/*14.  Write a program to add to fractions. Ex: - 1/3 + 3/9 = 2/3
(take numerators and denominators separately as input and give the simplified fraction of the sum as the output.*/

import java.util.Scanner;
class add_fractions{
	static int gcd(int a, int b){
    	if (a == 0)
        	return b;
    	return gcd(b%a, a);
	}
	static void lowest(int d3, int n3){
		int c = gcd(n3,d3);
    	d3 = d3/c;
    	n3 = n3/c;
    	System.out.println("Sum of given fraction is : "+n3+"/"+d3);
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st numerator and denomenator");
    	int n1=in.nextInt();
    	int d1=in.nextInt();
    	System.out.println("Enter 2nd numerator and denomenator");
    	int n2=in.nextInt();
    	int d2=in.nextInt();
    	int d3 = gcd(d1,d2);
		d3 = (d1*d2) / d3;
		int n3 = (n1)*(d3/d1) + (n2)*(d3/d2);
    	lowest(d3,n3);
	}
}