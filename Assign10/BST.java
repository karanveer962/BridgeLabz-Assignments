import java.util.*;

class INode<K> {
    K key;
    INode<K> left;
    INode<K> right;

    public INode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}

public class BST<K extends Comparable<K>> {
    private INode<K> root;

    public BST() {
        this.root = null;
    }

    public void add(K key) {
        root = addKey(root, key);
    }

    private INode<K> addKey(INode<K> root, K key) {
        if (root == null) {
            return new INode<>(key);
        }

        if (key.compareTo(root.key) < 0) {
            root.left = addKey(root.left, key);
        } else if (key.compareTo(root.key) > 0) {
            root.right = addKey(root.right, key);
        }

        return root;
    }

    public void inOrderTraversal() {
        inOrderTraversalRec(root);
    }

    private void inOrderTraversalRec(INode<K> root) {
        if (root != null) {
            inOrderTraversalRec(root.left);
            System.out.print(root.key + " ");
            inOrderTraversalRec(root.right);
        }
    }
    public int size() {
        return sizeTree(root);
    }

    private int sizeTree(INode<K> root) {
        if (root == null) {
            return 0;
        }
        return 1 + sizeTree(root.left) + sizeTree(root.right);
    }
    public boolean search(K key) {
        return searchTree(root, key);
    }

    private boolean searchTree(INode<K> root, K key) {
        if (root == null) {
            return false;
        }

        if (key.equals(root.key)) {
            return true;
        }

        if (key.compareTo(root.key) < 0) {
            return searchTree(root.left, key);
        } else {
            return searchTree(root.right, key);
        }
    }
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
         bst.add(56);
         bst.add(30);
         bst.add(70);
         bst.add(22);
         bst.add(40);
         bst.add(11);
         bst.add(3);
         bst.add(16);
         bst.add(60);
         bst.add(95);
         bst.add(65);
         bst.add(63);
         bst.add(67);
         
         System.out.println("Size of Tree is: "+bst.size());

         System.out.println("In-order Traversal:"); //to verify the arrangement
         bst.inOrderTraversal();
         System.out.println();
         

         if(bst.search(63))
         System.out.println("Node with key 63 found in the BST");
         else
         System.out.println("Node with key 63 not found in the BST");

    }
}
