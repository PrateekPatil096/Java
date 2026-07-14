import java.util.*;

class Animal {
    void eat() {
        System.out.println("animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("dog barks");
    }
}

public class q42 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }

}