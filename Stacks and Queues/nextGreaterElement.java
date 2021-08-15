/*4. Write a program to find the next greater element present/not present in the stack.
Ex: - input: 4, 5, 2, 25, 3, output: The next greater element for 4 is 5, 5 is 25, 2 is 25, 25 is -1 and 3 is -1.
(Note: if there is no next greater element present for a particular element, then return -1).
*/

import java.util.*;
public class nextGreaterElement {
    static class stack {
        int top;
        int items[] = new int[100];
        void push(int x){
            if (top == 99){
                System.out.println("Stack full");
            }
            else{
                items[++top] = x;
            }
        }

        int pop(){
            if (top == -1){
                System.out.println("Underflow error");
                return -1;
            }
            else {
                int element = items[top];
                top--;
                return element;
            }
        }

        boolean isEmpty()
        {
            return (top == -1) ? true : false;
        }
    }
    static void nextGreater(int arr[], int n){
        int i = 0;
        stack s = new stack();
        s.top = -1;
        int element, next;
        s.push(arr[0]);
        for (i = 1; i < n; i++){
            next = arr[i];

            if (s.isEmpty() == false){
                element = s.pop();
                while (element < next){
                    System.out.println(element + " --> "+ next);
                    if (s.isEmpty() == true)
                        break;
                    element = s.pop();
                }
                if (element > next)
                    s.push(element);
            }
            s.push(next);
        }
        while (s.isEmpty() == false){
            element = s.pop();
            next = -1;
            System.out.println(element + " -- " + next);
        }
    }
    public static void main(String[] args){
        int arr[] = { 11, 13, 21, 3 };
        int n = arr.length;
        nextGreater(arr, n);
    }
}