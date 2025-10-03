// A generic interface
interface Container<T> {
    void add(T item);
    T get();
}

// A class that implements the generic interface with String type
class StringContainer implements Container<String> {
    private String data;

    @Override
    public void add(String item) {
        this.data = item;
    }

    @Override
    public String get() {
        return data;
    }
}

// A class that implements the generic interface with Integer type
class IntegerContainer implements Container<Integer> {
    private Integer data;

    @Override
    public void add(Integer item) {
        this.data = item;
    }

    @Override
    public Integer get() {
        return data;
    }
}

public class GenericInterfaceDemo {
    public static void main(String[] args) {
        Container<String> strBox = new StringContainer();
        strBox.add("Hello Generics!");
        System.out.println("String Container: " + strBox.get());

        Container<Integer> intBox = new IntegerContainer();
        intBox.add(101);
        System.out.println("Integer Container: " + intBox.get());
    }
}
