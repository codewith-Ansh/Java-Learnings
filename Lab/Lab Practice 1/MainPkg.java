import package1.A;
import package1.B;
import package2.C;
import package2.D;

public class MainPkg {
    public static void main(String[] args) {
        System.out.println("Access Modifiers Demonstration\n"); 

        System.out.println("--- In-class Access ---");
        A objA = new A();
        objA.methodA();

        System.out.println("\n--- Same Package Access (class B) ---");
        B.main(null); // Call the static main method of B

        System.out.println("\n--- Different Package Access (non-subclass C) ---");
        C.main(null); // Call the static main method of C

        System.out.println("\n--- Different Package Access (subclass D) ---");
        D.main(null); // Call the static main method of D
    }
}