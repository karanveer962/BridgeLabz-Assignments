import java.util.*;

class Queue<T> {
    private LinkedList<T> list;

    public Queue() {
        list = new LinkedList<>();
    }

    public void enqueue(T data) {
        list.append(data);
    }

    public T peek() {
        return list.getHead().data;
    }

    public T dequeue() {
        if(list.getHead()==null){
            throw new IllegalArgumentException("Queue is already Empty");
        }
            T var=list.getHead().data;
            list.pop();
            return var;
    }

    public boolean isEmpty() {
        return list.size()==0;
    }

    public int size(){
        return list.size();
    }
    public void display(){
        System.out.print("Queue: ");
        list.display();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
         
        queue.display();
        
        while (!queue.isEmpty()) {
            System.out.println("Peek: " + queue.peek());
            System.out.println("Dequeue: " + queue.dequeue());
        }
    }
}