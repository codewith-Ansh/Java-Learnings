import java.util.*;

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

    @Override
    public String toString() {
        return "Box{" + "value=" + value + '}';
    }
}

public class GenericsAndCollections {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(100);
        Box<String> strBox = new Box<>("Hello Generics!");

        System.out.println(intBox);
        System.out.println(strBox);

        List<String> students = new ArrayList<>();
        students.add("Ansh");
        students.add("Vraj");
        students.add("Manthan");

        System.out.println("\nList of Students:");
        for (String name : students) {
            System.out.println(name);
        }

        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Ansh");
        studentMap.put(2, "Vraj");
        studentMap.put(3, "Manthan");

        System.out.println("\nStudent Map:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        System.out.println("\nUsing Iterator:");
        Iterator<String> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nGeneric Method Output:");
        printElement(123);
        printElement("Generic Method Working!");
    }

    public static <T> void printElement(T element) {
        System.out.println("Element: " + element);
    }
}
