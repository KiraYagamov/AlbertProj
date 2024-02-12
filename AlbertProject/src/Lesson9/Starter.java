package Lesson9;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        Driver driver = new Driver(5);
        persons.add(driver);
        driver.drive();

        Builder builder = new Builder(5);
        persons.add(builder);

        builder.build();
        builder.drive();
        builder.sayName();

        Person person = new Person();
        persons.add(person);

        for (Person p : persons) {
            p.sayName();
        }
    }
}