/*6. Write a program to sort (increasing or decreasing) the elements in a stack.
*/

import java.util.*;
class sortStack{
    public static Stack<Integer> sortstack(Stack<Integer> input){
        Stack<Integer> s = new Stack<Integer>();
        while(!input.isEmpty()){
            int tmp = input.pop();
            while(!s.isEmpty() && s.peek() > tmp){
            	input.push(s.pop());
            }
            s.push(tmp);
        }
        return s;
    }
    public static void main(String args[]){
        Stack<Integer> input = new Stack<Integer>();
        input.add(1);
        input.add(3);
        input.add(9);
        input.add(5);
        input.add(8);
        input.add(2);
        Stack<Integer> s=sortstack(input);
        System.out.println("Sorted numbers are:");

        while (!s.empty()){
            System.out.print(s.pop()+" ");
        }
        System.out.println();
    }
}