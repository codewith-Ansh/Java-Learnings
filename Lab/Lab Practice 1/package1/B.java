package package1;

public class B {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("In class B (same package)");
        // System.out.println("Private : " + obj.a); // Not accessible, causes a compile-time error
        System.out.println("Public : " + obj.b);     // Accessible
        System.out.println("Protected : " + obj.c);  // Accessible
        System.out.println("Default : " + obj.d);    // Accessible
    }
}