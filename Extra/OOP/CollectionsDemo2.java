import java.util.*;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        
        // PriorityQueue (min-heap by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        System.out.println("PriorityQueue (Min-Heap): " + pq);
        System.out.println("Polling from PQ (smallest first): " + pq.poll());

        // Stack (LIFO)
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        System.out.println("Stack: " + stack);
        System.out.println("Popped from Stack: " + stack.pop());

        // TreeSet (Sorted + No duplicates)
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(10); // duplicate ignored
        System.out.println("TreeSet (Sorted Unique): " + treeSet);

        // TreeMap (Sorted key-value pairs)
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("C", 70);
        treeMap.put("A", 95);
        treeMap.put("B", 85);
        System.out.println("TreeMap (Sorted by Key): " + treeMap);

        // Sorting with Collections.sort and Comparator
        List<String> names = new ArrayList<>(Arrays.asList("Ravi", "Ansh", "Kiran"));
        Collections.sort(names); // Natural order
        System.out.println("Sorted Names: " + names);

        // Custom sorting with Comparator (reverse order)
        Collections.sort(names, Comparator.reverseOrder());
        System.out.println("Reverse Sorted Names: " + names);

        // Iterator Example
        Iterator<String> it = names.iterator();
        System.out.print("Iterating names: ");
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
