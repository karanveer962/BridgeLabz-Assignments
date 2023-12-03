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
   

    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
         bst.add(56);
         bst.add(30);
         bst.add(70);
         

         System.out.println("In-order Traversal:"); //to verify the arrangement
         bst.inOrderTraversal();
    }
}
