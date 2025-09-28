import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        // List Example
        List<String> list = new ArrayList<>();
        list.add("Ansh");
        list.add("Ravi");
        list.add("Ansh"); // duplicate allowed
        System.out.println("List: " + list);

        // Set Example
        Set<String> set = new HashSet<>(list); // removes duplicates
        System.out.println("Set: " + set);

        // Queue Example
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue: " + queue);

        // Map Example
        Map<String, Integer> map = new HashMap<>();
        map.put("Maths", 95);
        map.put("Physics", 90);
        map.put("Maths", 100); // overwrites value
        System.out.println("Map: " + map);
    }
}
