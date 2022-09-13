package guru.qa;

public class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void increaseAge(int value) {
        this.age = age + value;
    }

    void goToPension() {
        if (age > 65) {
            System.out.println("Я на пенсии :(");
        } else {
            System.out.println("Я еще молод!");
        }
    }

    void sayName() {
        System.out.println("Мое имя: " + name);
    }
}
