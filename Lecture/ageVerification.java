import java.util.*;

class myException extends Exception{
    myException(String s){
        super(s);
    }
}
public class ageVerification {
    public static void main(String[] args) {
        int age;
        Scanner scanf = new Scanner(System.in);
        age = scanf.nextInt();

        try {
            if (age < 18) {
                throw new myException("You are not eligible for the license!");
            } else if (age > 18 && age <= 60) {
                System.out.println("You are eligible for the license");
            } else {
                throw new myException("You don't need license!");
            }
        } catch (myException e) {
            System.out.println(e);
        }
    }
}
 