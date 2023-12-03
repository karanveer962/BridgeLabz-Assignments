import java.util.LinkedList;

class MyMapNode {
    String key;
    int value;

    MyMapNode(String key) {
        this.key = key;
        this.value = 1;
    }
}

class HashTable{
    private static final int tableSize = 10;
    private LinkedList<MyMapNode>[] table;

    HashTable() {
        table = new LinkedList[tableSize];
        for (int i = 0; i < tableSize; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hashFunction(String key) {
        int hash = 0,i=1;
        for (char c : key.toCharArray()) {
            hash += (c-'a')*(i++);
        }
        return hash % tableSize;
    }

    void insert(String key) {
      
        int index = hashFunction(key);

        for (MyMapNode node : table[index]) {
            if (node.key.equals(key)) {
                node.value++;
                return;
            }
        }

        table[index].add(new MyMapNode(key));
    }

    void display() {
        for (int i = 0; i < tableSize; i++) {
            for (MyMapNode node : table[i]) {
                System.out.println(i+" "+node.key + ": " + node.value);
            }
        }
    }
    public static void main(String[] args) {
        
        String sentence = "To be or not to be";

        
        HashTable hashTable = new HashTable();

        
        String[] words = sentence.split(" ");
        for (String word : words) {
            hashTable.insert(word);
        }

        hashTable.display();
    }
}
