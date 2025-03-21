package task3;

public class Task3 {
    public static void runTask3() {
        Person person1 = new Person("Alex", 20);
        Person person2 = new Person("Jerry", 18);
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        changeIdentities( person1, person2);
        System.out.println("After swap: ");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }

    public static void changeIdentities(Person p1, Person p2) {
        int tempAge = p1.age;
        String tempName = p1.name;
        p1.name = p2.name;
        p1.age = p2.age;
        p2.name = tempName;
        p2.age = tempAge;
    }
}

