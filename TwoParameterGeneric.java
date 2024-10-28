// Two Parameter Generic Class
class Pair<T, V> {
    private T key;
    private V value;

    public Pair(T key, V value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class TwoParameterGeneric {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Number", 298); 
        String key = pair.getKey(); 
        System.out.println("Auto-unboxed String : " + key);
    
        int value = pair.getValue(); 
        System.out.println("Auto-unboxed Number: " + value);
    }
}
