import java.util.*;
import java.io.*;

public class LinkedList<T> {

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insert(T data, int position) {
        if (position < 0) {
            throw new IllegalArgumentException("Invalid position");
        }

        Node<T> newNode = new Node<>(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> current = head;
            for (int i = 0; i < position - 1; i++) {
                if (current == null) {
                    throw new IllegalArgumentException("Invalid position");
                }
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);

        System.out.print(" Linked List: ");
        linkedList.display();
      
        linkedList.insert(40, 9);

       
        System.out.print("Linked List after Insertion: ");
        linkedList.display();

    }
}
