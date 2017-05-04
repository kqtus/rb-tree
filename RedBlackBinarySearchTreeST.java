import java.util.Set;
 
public class RedBlackBinarySearchTreeST<K extends Comparable, V> extends AbstractSymbolTable<K, V> {
    private int counter;
 
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
        return null;
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
        
    }
}