/*13.     Write a program to reverse a queue.
*/

import java.util.*;
public class reverseQueue {
    static Queue<Integer> queue;
    static void rev(){
        while (!queue.isEmpty()) {
            System.out.print( queue.peek() + " ");
            queue.remove();
        }
    }
    static void reversequeue(){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.peek());
            queue.remove();
        }
        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
    }
    public static void main(String args[]){
        queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        reversequeue();
        rev();
        System.out.println();
    }
}