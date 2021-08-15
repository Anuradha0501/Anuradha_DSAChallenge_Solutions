/*2. Write a program to implement a stack using a linked list.
*/
import java.util.*;
public class stackUsingLinkedList {
    private Node head;
    private class Node {
        int value;
        Node next;
    }
    public stackUsingLinkedList() {
        head = null;
    }
    public void push(int value) {
        Node oldHead = head;
        head = new Node();
        head.value = value;
        head.next = oldHead;
    }

    public static void main(String args[])
    {
        stackUsingLinkedList stack=new stackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        printList(stack.head);
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }
}
