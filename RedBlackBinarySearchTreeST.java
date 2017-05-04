import java.util.Set;
 
public class RedBlackBinarySearchTreeST<K extends Comparable, V> extends AbstractSymbolTable<K, V> {
    private int counter;
    private Node root;

    public RedBlackBinarySearchTreeST() {
        root = null;
    }
    @Override
    public int size() {
        return counter;
    }
 
    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }
 
    @Override
    public boolean containsKey(Object key) {
        return false;
    }
 
    @Override
    public V get(Object key) {
        return null;
    }
 
    @Override
    public V put(K key, V value) {
        Node z = new Node(null, null, null, key, value, 0);
        Node y = null;
        Node x = root;

        while (x != null) {
            y = x;
            if (z.key < x.key) {
                x = x.left;
            }
            else {
                x = x.right;
            }
        }

        z.parent = y;
        if (y == null) {
            root = z;
        }
        else if (z/key < y.key) {
            y.left = z;
        }
        else {
            y.right = z;
        }
        z.left = null;
        z.right = null;
        z.color = 1;
        insertFixup(z);
        return null;
    }

    // TODO: Finish
    private void insertFixup(Node z) {
        while (z.parent.color == 1) {
            if (z.parent == z.parent.parent.left) {
                y = z.parent.parent.right;
                if (y.color == 1) {
                    z.parent.color = 0;
                    y.color = 0;
                }
                else if (z == z.parent.right) {
                    z = z.parent;
                    leftRotate(z);
                }
                z.parent.color = 0;
                z.parent.parent.color = 1;
                rightRotate(z.parent.parent);
            }
            else {
                
            }
        }
    }
 
    @Override
    public V remove(Object key) {
        return null;
    }
 
    @Override
    public Set<K> keySet() {
        return null;
    }
 
    private class Node {
        public Node right;
        public Node left;
        public Node parent;
        public K key;
        public V value;
        public boolean color; // 0 - black, 1 - red

        public Node(Node r, Node l, Node p, K key, V value, boolean color) {
            right = r;
            left = l;
            parent = p;
            this.key = key;
            this.value = value;
            this.color = color;
        }
    }

    private void leftRotate(Node x) {
        Node y = x.right;

        x.right = y.left;
        if (y.left != null) {
            y.left.parent = x;
        }

        y.parent = x.parent;
        if (x.parent == null) {
            this.root = y;
        }
        else if (x == x.parent.left) {
            x.parent.left = y;
        }
        else {
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;
    }

    private void rightRotate(Node x) {
        // -- TODO
    }
}