public class UnboxingExample {
    public static void main(String[] args) {
        // This works fine - automatic unboxing
        Integer integerObj = 10;
        int intValue = integerObj;
        System.out.println("Successful unboxing: " + intValue);

        // This doesn't work - can't unbox Number to int
        Number numberObj = 20;
        //int anotherIntValue = numberObj; // This line would cause a compile-time error

        // We need to explicitly cast
        int anotherIntValue = numberObj.intValue();
        System.out.println("Manual unboxing: " + anotherIntValue);

        // Another example with Double
        Number doubleNumber = 30.5;
        // int doubleToInt = doubleNumber; // This would cause a compile-time error

        // We need to explicitly cast and be aware of potential precision loss
        int doubleToInt = doubleNumber.intValue();
        System.out.println("Manual unboxing with potential precision loss: " + doubleToInt);
        double doubleToDouble = doubleNumber.doubleValue();
        System.out.println("Manual unboxing: " + doubleToDouble);

    }
}