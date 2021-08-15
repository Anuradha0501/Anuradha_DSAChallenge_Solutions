/*1. Write a program to implement a stack using an array.
*/
import java.util.*;
public class stackUsingArray {
    int size;
    int arr[];
    int top;

    stackUsingArray(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int n) {
        if (!isFull()) {
            top++;
            arr[top] = n;
            System.out.println(n);
        } else {
            System.out.println("Stack is full !");
        }
    }

    public boolean isFull() {
        return (size - 1 == top);
    }

    public static void main(String[] args) {
        stackUsingArray stack = new stackUsingArray(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
    }
}