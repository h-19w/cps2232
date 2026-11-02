package ADTs.Maps;
import java.util.Map.Entry;
//hadassah //lab 4
public interface MapADTInterface {
    public interface Map<K, V> {
        int size();
        boolean isEmpty();
        V get(K key);
        V remove(K key, V value);
        Iterable<K> KeySet();
        Iterable<V> Values();
        Iterable<Entry<K, V>> EntrySet();
    }
}
