import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListVsArrayListDemo {
    public static void main(String[] args) {
        // Using List interface
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        // Using ArrayList class
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements
        list1.add("Apple");
        list2.add("Banana");
        arrayList.add("Cherry");

        System.out.println("List1 (ArrayList): " + list1);
        System.out.println("List2 (LinkedList): " + list2);
        System.out.println("ArrayList: " + arrayList);

        // Demonstrating polymorphism
        processList(list1);
        processList(list2);
        processList(arrayList);

        // ArrayList specific method
        arrayList.ensureCapacity(20);
        // list1.ensureCapacity(20); // This would cause a compile-time error

        // Creating a fixed-size list from an ArrayList
        List<String> fixedSizeList = List.of("One", "Two", "Three");
        // fixedSizeList.add("Four"); // This would throw UnsupportedOperationException

        // Demonstrating type safety
        // List<String> stringList = new ArrayList<Integer>(); // Compile-time error

        // Demonstrating runtime type checking
        System.out.println("\nRuntime type checking:");
        System.out.println("list1 is ArrayList: " + (list1 instanceof ArrayList));
        System.out.println("list2 is ArrayList: " + (list2 instanceof ArrayList));
        System.out.println("arrayList is List: " + (arrayList instanceof List));

        // Demonstrating the ability to change implementation
        List<String> switchableList = new ArrayList<>();
        switchableList.add("Easy");
        switchableList.add("to");
        switchableList.add("switch");

        System.out.println("\nOriginal list: " + switchableList);

        // Switch implementation to LinkedList
        switchableList = new LinkedList<>(switchableList);
        System.out.println("After switching to LinkedList: " + switchableList);
    }

    // Method that works with any List implementation
    public static void processList(List<String> list) {
        System.out.println("Processing list: " + list.getClass().getSimpleName());
    }
}