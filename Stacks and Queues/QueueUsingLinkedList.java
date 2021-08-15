/*12.     Write a program to implement a queue using a linked list.
*/

import java.util.*;
public class QueueUsingLinkedList{
	 private Node front, rear;
	 private int currentSize;
	 private class Node{
		 int data;
		 Node next;
	 }
	 public QueueUsingLinkedList(){
		 front = null;
		 rear = null;
		 currentSize = 0;
	 }

	 public boolean isEmpty(){
	 	return (currentSize == 0);
	 }
	 public int dequeue(){
		 int data = front.data;
		 front = front.next;
		 if (isEmpty()){
		 	rear = null;
		 }
		 currentSize--;
		 System.out.println(data+ " removed from the queue");
		 return data;
	 }
	 public void enqueue(int data){
		 Node oldRear = rear;
		 rear = new Node();
		 rear.data = data;
		 rear.next = null;
		 if (isEmpty()) {
		 	front = rear;
		 }
		 else {
		 	oldRear.next = rear;
		 }
		 currentSize++;
		 System.out.print(data+ " ");
	 }
	 public static void main(String a[]){

		 QueueUsingLinkedList queue = new QueueUsingLinkedList();
		 queue.enqueue(1);
		 queue.enqueue(2);
		 queue.enqueue(3);
		 queue.enqueue(4);
		 queue.enqueue(5);
		 System.out.println();
	 }
}