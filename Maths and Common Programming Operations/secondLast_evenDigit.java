/*8. Write a program to print the second last even digit.
Ex: - input: 23863, output: 8. Input: 325145761, output 4.*/

import java.util.Scanner;
class secondLast_evenDigit{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
  		 int y=0;
		  int x= in.nextInt();
		  while(true)
		  {
		   while(x%2==0 && x>0)
		   {
		    x=x/10;

		    while(x%2==0 && x>0)
		    {
		     y=x%10;
		     System.out.println(y);
		     break;
		    }


		   }
  }
 	}
}