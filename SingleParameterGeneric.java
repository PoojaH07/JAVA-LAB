// Single Parameter Generic Class
class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class SingleParameterGeneric {
    public static void main(String[] args) {
        // Autoboxing
        Box<Integer> integerBox = new Box<>(10); 
        

        // Auto-unboxing
        int intValue = integerBox.getValue(); 
        System.out.println("Auto-unboxed value: " + intValue);
    }
}
