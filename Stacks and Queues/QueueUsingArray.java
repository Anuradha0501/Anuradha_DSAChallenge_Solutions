/*11.   Write a program to implement a queue using an array.
*/

import java.util.*;
public class QueueUsingArray{
    private int capacity;
    int queueArr[];
    int front;
    int rear;
    int currentSize = 0;

    public QueueUsingArray(int sizeOfQueue) {
        this.capacity = sizeOfQueue;
        front = 0;
        rear = -1;
        queueArr = new int[this.capacity];
    }
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full!! Can not add more elements");
        } else {
            rear++;
            if (rear == capacity - 1) {
                rear = 0;
            }
            queueArr[rear] = data;
            currentSize++;
            System.out.print(data + " ");
        }
    }
    public boolean isFull() {
        if (currentSize == capacity) {
            return true;
        }
        return false;
    }

    public static void main(String a[]) {

        QueueUsingArray queue = new QueueUsingArray(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println();
    }
}
