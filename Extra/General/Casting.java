package General;
public class Casting {
    public static void main(String[] args){
        // casting
        // ----- IMPLICIT (smaller to bigger) -----
        double price = 100.00;
        double finalPrice = price + 18;
        System.out.println(finalPrice); // 118.0

        // ----- EXPLICIT (bigger to smaller) -----
        int p = 100;
        // int fP = p + 18.0;  // not allowed because 18.0 != 18

        int fP = p + (int)18.99;    // values after . will be truncated
        System.out.println(fP);     // 118
    }
}
