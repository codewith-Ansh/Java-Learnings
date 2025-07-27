package OOP;

// Abstract class
abstract class Shape {
    // Abstract method
    abstract void draw();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Subclass 1
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Subclass 2
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

// Main class
public class abstractClass {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.draw();
        s1.display();

        System.out.println("------------------");

        Shape s2 = new Rectangle();
        s2.draw();
        s2.display();
    }
}
