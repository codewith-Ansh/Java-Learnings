package OOP;

interface Animal {
    void speak();
}

class Dog implements Animal {
    public void speak() {
        System.out.println("Barks");
    }
}

class Cat implements Animal {
    public void speak() {
        System.out.println("Meows");
    }
}

public class DMD {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.speak(); // Barks

        a = new Cat();
        a.speak(); // Meows
    }
}
