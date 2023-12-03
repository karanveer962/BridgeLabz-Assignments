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
    void remove(String key) {
       
        int index = hashFunction(key);
        for (MyMapNode node : table[index]) {
            if (node.key.equals(key)) {
                table[index].remove(node);
                System.out.println("\nNode with given key "+key+" removed");
                return;
            }
        }
        System.out.println("\nNode with given key "+key+" not found");
    }

    void display() {
        for (int i = 0; i < tableSize; i++) {
            for (MyMapNode node : table[i]) {
                System.out.println(node.key + ": " + node.value);
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

        
        String sentence2="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        System.out.println(sentence2);
        HashTable hashTable2 = new HashTable();

        String[] words2 = sentence2.split(" ");
        for (String word : words2) {
            hashTable2.insert(word);
        }
        hashTable2.display();


        hashTable2.remove("avoidable");
        System.out.println("\nAfter removal hash table :\n");
        hashTable2.display();
    }
}
