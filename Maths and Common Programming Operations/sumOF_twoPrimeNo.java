/* 13. Write a program to express a user-input number as a sum of two prime numbers.*/

import java.util.Scanner;
class sumOF_twoPrimeNo{
	static boolean check(int num) {
		boolean prime = true;
		for (int i = 2; i <= num / 2; ++i) {
		  if (num % i == 0) {
			prime = false;
			break;
		  }
		}
	    return prime;
 	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    boolean flag = false;
	    for (int i = 2; i <= n / 2; ++i) {
	      if (check(i)) {
	        if (check(n - i)){
				int a = i, b = n-i;
	            System.out.println(n+ "=" + a +"+" + b);
	            flag = true;
	        }
	      }
	    }
	    if (!flag)
	      System.out.println("can't express as sum of prime no.s");
	  }
}