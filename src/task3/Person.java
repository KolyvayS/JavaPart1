package task3;

class Person {
    int age;
    String name;

    Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Name is " + name + ", age is " + age;
    }
}