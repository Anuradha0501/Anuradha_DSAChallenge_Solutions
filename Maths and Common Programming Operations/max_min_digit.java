/*7. Write a program to find the maximum and minimum digit from a number.
*/

import java.util.Scanner;
class max_min_digit{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
  		int n = in.nextInt();
  		int max=0;
		int min = n%10;
		int t;
		while(n > 0) {
			t = n % 10;
			if(t < min) {
				min = t;
			}
			if(t > max) {
				max = t;
			}
			n /= 10;
		}

    	System.out.println("Max : "+ max + "\nMin : " + min);
 	}
}