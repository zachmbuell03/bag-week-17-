package bag;

import java.util.HashMap;
import java.util.Map;

public class Bag<T> {

    private Map<T, Integer> items;

    public Bag() {
        items = new HashMap<>();
    }

    // Add one occurrence of an element
    public void add(T element) {
        items.put(element, items.getOrDefault(element, 0) + 1);
    }

    // Remove one occurrence of an element
    public boolean remove(T element) {
        if (!items.containsKey(element)) {
            return false;
        }

        int count = items.get(element);

        if (count == 1) {
            items.remove(element);
        } else {
            items.put(element, count - 1);
        }

        return true;
    }

    // Check if element exists in the bag
    public boolean contains(T element) {
        return items.containsKey(element);
    }

    // Count occurrences of an element
    public int count(T element) {
        return items.getOrDefault(element, 0);
    }

    // Total number of elements (including duplicates)
    public int size() {
        int total = 0;
        for (int c : items.values()) {
            total += c;
        }
        return total;
    }

    // Check if bag is empty
    public boolean isEmpty() {
        return items.isEmpty();
    }

    // Clear the bag
    public void clear() {
        items.clear();
    }

    @Override
    public String toString() {
        return items.toString();
    }
}
