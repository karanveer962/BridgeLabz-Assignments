import java.util.*;

class Stack<T> {
    private LinkedList<T> list;

    public Stack() {
        list = new LinkedList<>();
    }

    public void push(T data) {
        list.append(data);
    }

    public T peek() {
        T top = this.pop();
        list.append(top);
        return top;
    }

    public T pop() {
        if (list.getHead() == null) {
            throw new IllegalArgumentException("Stack is already Empty");
        }
        return list.popLast();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }

    public void display() {
        System.out.print("Stack: ");
        list.display();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(56);
        stack.push(30);
        stack.push(70);

        stack.display();

        while (!stack.isEmpty()) {
            System.out.println("Peek: " + stack.peek());
            System.out.println("Pop: " + stack.pop());
        }
    }
}