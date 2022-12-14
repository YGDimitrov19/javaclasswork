import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ClassworkMain {
    public static void main(String[] args) {
        Person person1 = new Person("Gosho");
        Mammal person2 = new Person("Pesho");
        Animal person3 = new Person("Stamat");
        person1.eat();
        person1.walk();
        person1.sleep();
        if(person2 instanceof Person)
        {
            ((Person) person2).sleep();
        }
        person2.walk();
        person3.eat();
    }
}
public class Person extends Mammal implements Animal{
    private String name;
    public Person(String name)
    {
        this.name = name;
    }
    @Override
    public void eat() {
        System.out.println("Person is eating..");
    }
    @Override
    public void walk() {
        System.out.println("Person is walking..");
    }

    public void sleep() {
        System.out.println("Person is sleeping...");
    }
}
public abstract class Mammal {
    public abstract void walk();
}
public interface Animal {
    void eat();
}
