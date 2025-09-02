package package2;
import package1.A;

// D must extend A to access the protected member
public class D extends A {
    public static void main(String[] args) {
        D obj = new D();
        System.out.println("In class D (different package, subclass)");
        // System.out.println("Private : " + obj.a);     // Not accessible
        System.out.println("Protected : " + obj.c);    // Accessible through subclass inheritance
        System.out.println("Public : " + obj.b);       // Accessible
        // System.out.println("Default : " + obj.d);     // Not accessible
    }
}