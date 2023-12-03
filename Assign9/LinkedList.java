public class LinkedList<T> {

    public static class Node<T> {
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

    public void append(T data) {
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

    public Node<T> getHead(){
         return this.head;
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    public T popLast() {
        T var=(head.next==null)?head.data:null;

        if (head == null || head.next == null) {
            head = null;
        } else {
            Node<T> current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            var=current.next.data;
            current.next = null;
        }
        return var;
    }

    public Node<T> search(T key) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(key)) {
                return current; 
            }
            current = current.next;
        }
        return null;
    }

    public void insertAfter(T key, T newData) {
        Node<T> nodeToInsertAfter = search(key);

        if (nodeToInsertAfter != null) {
            Node<T> newNode = new Node<>(newData);
            newNode.next = nodeToInsertAfter.next;
            nodeToInsertAfter.next = newNode;
        } else {
            System.out.println("Node with key " + key + " not found.");
        }
    }

    public void delete(T key) {
        Node<T> current = head;
        Node<T> prev = null;

        while (current != null && !current.data.equals(key)) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        if (prev == null) {
            head = current.next;
        } else {
            
            prev.next = current.next;
        }
    }

    public Node<T> getHead(){
        return this.head;
    }

    public int size() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

       
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);

       
        System.out.print("Linked List: ");
        linkedList.display();
         
        linkedList.insert(40,2);
        System.out.print("Linked List after insertion: ");
        linkedList.display();

        linkedList.pop();
        System.out.print("Linked List after pop: ");
        linkedList.display();

        
        linkedList.popLast();
        System.out.print("Linked List after popLast: ");
        linkedList.display();
       

         Node<Integer> foundNode = linkedList.search(30);
        if(foundNode!=null){
            System.out.println("Node 30 present in the list");
        }
        else{
            System.out.println("Node not present in the list");
        }
       
        linkedList.insertAfter(40, 50);
        System.out.print("Linked List after insertAfter: ");
        linkedList.display();

        linkedList.delete(40);
        System.out.print("Linked List after deletion: ");
        linkedList.display();

        System.out.println("Size of linkedlist is: "+linkedList.size());
    }
}

