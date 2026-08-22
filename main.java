package bag;

public class main {
    public static void main(String[] args) {
        Bag<String> bag = new Bag<>();

        bag.add("apple");
        bag.add("apple");
        bag.add("banana");

        System.out.println(bag.count("apple"));   // 2
        System.out.println(bag.contains("banana")); // true
        System.out.println(bag.size()); // 3

        bag.remove("apple");
        System.out.println(bag.count("apple")); // 1

        System.out.println(bag); // {apple=1, banana=1}
    }
}
