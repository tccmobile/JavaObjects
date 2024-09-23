public class Main {

    public static void main(String[] args) {
        Person one = new Person();  // creates with default constructor
        Person two = new Person("Carl", 65);
        Person three = new Person("Kim");

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

       // one.haveBirthday();
        two.haveBirthday();
        three.haveBirthday();

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

        if (one.isMinor()) {
            System.out.println(one.getFullName() + " is a minor");
        } else {
            System.out.println(one.getFullName() + " is an adult");
    }
        one.haveBirthday();

        if (one.isMinor()) {
            System.out.println(one.getFullName() + " is a minor");
        } else {
            System.out.println(one.getFullName() + " is an adult");
        }

    }
}
