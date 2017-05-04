import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class AbstractSymbolTable<K extends Comparable,V> implements Map<K,V> {
 
    @Override
    public abstract int size();
 
    @Override
    public  abstract boolean isEmpty();
 
    @Override
    public abstract boolean containsKey(Object key);
 
    @Override
    public boolean containsValue(Object value) {
        /** You do not need to implement this method */
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }
 
    @Override
    public abstract V get(Object key);
 
    @Override
    public abstract V put(K key, V value);
 
    @Override
    public abstract V remove(Object key);
 
    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        /** You do not need to implement this method */
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }
 
    @Override
    public void clear() {
        /** You do not need to implement this method */
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }
 
    @Override
    public abstract Set<K> keySet();
 
    @Override
    public Collection<V> values() {
        /** You do not need to implement this method */
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }
 
    @Override
    public Set<Entry<K, V>> entrySet() {
        /** You do not need to implement this method */
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }
}