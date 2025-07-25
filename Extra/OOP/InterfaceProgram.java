package OOP;

interface Animal {
    void makeSound(); // abstract method

    void sleep(); // abstract method
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }

    public void sleep() {
        System.out.println("Dog sleeps in a kennel.");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }

    public void sleep() {
        System.out.println("Cat sleeps on a sofa.");
    }
}

public class InterfaceProgram {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.sleep();

        System.out.println("-------------------");

        Animal cat = new Cat();
        cat.makeSound();
        cat.sleep();
    }
}
