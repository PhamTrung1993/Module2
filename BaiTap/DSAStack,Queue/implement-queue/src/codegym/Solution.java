package codegym;

import java.util.Queue;

public class Solution {
    // Structure of a Node
    static class Node {
        int data;
        Node link;
    }
    static class Queue {
        Node front, rear;
    }
    // Function to create Circular queue
    static void enQueue(Queue que, int value) {
        Node temp = new Node();
        temp.data = value;
        if (que.front == null) {
            que.front = temp;
        }
        else {
            que.rear.link = temp;
        }
        que.rear = temp;
        que.rear.link = que.front;
    }
    // Function to delete element from Circular Queue
    static int deQueue(Queue que) {
        if (que.front == null) {
            System.out.println("Queue is empty");
            return  Integer.MIN_VALUE;
        }
        // If this is the last node to be deleted
        int value = 0;
        if (que.front == que.rear) {
            value = que.front.data;
            que.front = null;
            que.rear = null;
        }
        else {
            Node temp = que.front;
            value = temp.data;
            que.front = que.front.link;
            que.rear.link = que.front;
        }
        return value;
    }
    // Functrion displaying the elements of Circular Queue
    static void displayQueue(Queue que) {
        Node temp = que.front;
        System.out.println("Elements in Circular Queue are: ");
        while (temp.link != que.front) {
            System.out.printf("%d",temp.data);
            System.out.print("\t");
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
        System.out.print("\n");
    }
}
