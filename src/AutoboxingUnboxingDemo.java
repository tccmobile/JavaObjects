public class AutoboxingUnboxingDemo {
    public static void main(String[] args) {
        // Autoboxing examples
        Integer intObject = 100; // Autoboxing of int to Integer
        Double doubleObject = 20.5; // Autoboxing of double to Double
        Character charObject = 'A'; // Autoboxing of char to Character

        System.out.println("Autoboxing examples:");
        System.out.println("Integer object: " + intObject);
        System.out.println("Double object: " + doubleObject);
        System.out.println("Character object: " + charObject);

        // Unboxing examples
        int intValue = intObject; // Unboxing of Integer to int
        double doubleValue = doubleObject; // Unboxing of Double to double
        char charValue = charObject; // Unboxing of Character to char

        System.out.println("\nUnboxing examples:");
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("char value: " + charValue);

        // Autoboxing in method invocation
        printSum(10, 20); // ints are autoboxed to Integers

        // Unboxing in expressions
        Integer sum = intObject + 50; // intObject is unboxed, operation performed, result is autoboxed
        System.out.println("\nUnboxing in expression result: " + sum);

        Integer newVal = 3;
        // Autoboxing and unboxing in collections
        java.util.List<Integer> list = new java.util.ArrayList<>();
        list.add(1); // Autoboxing 1 to Integer
        list.add(newVal); // Autoboxing 2 to Integer
        int firstElement = list.get(0); // Unboxing Integer to int
        System.out.println("\nFirst element from list (unboxed): " + firstElement);
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println("\nSum from printSum method: " + (a + b)); // Unboxing occurs here
    }
}