import java.util.*;
import java.util.Map.Entry;
class LRUCache {

    LRUMap map;
    public LRUCache(int capacity) {
        map=new LRUMap(capacity);
    }
    
    public int get(int key) {
        if (map.containsKey(key)){
            int value= map.get(key);
            put(key,value);
            return value;
        }       
        return -1;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) map.remove(key);
        map.put(key,value);
    }
    
}

class LRUMap extends LinkedHashMap<Integer,Integer>{
    private int max;
    LRUMap(int max){
        this.max=max;
    }
    protected boolean removeEldestEntry(Entry<Integer, Integer> eldest){
        return size()>max;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
