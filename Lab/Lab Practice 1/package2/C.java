package package2;
import package1.A;

public class C {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("In class C (different package, non-subclass)");
        // System.out.println("Private : " + obj.a);     // Not accessible
        // System.out.println("Protected : " + obj.c);   // Not accessible
        System.out.println("Public : " + obj.b);        // Accessible
        // System.out.println("Default : " + obj.d);     // Not accessible
    }
}