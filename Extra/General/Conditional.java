package General;
import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        boolean isSunUp;
        System.out.println("Is sun up?(y/n): ");

        Scanner sc = new Scanner(System.in);
        String check = sc.next();
        if(check.equals("y") || check.equals("Y")){
            isSunUp = true;
        }
        else{
            isSunUp =  false;
        }
        if(isSunUp){
            System.out.println("Day!");
        }
        else{
            System.out.println("Night!");
        }
    }
}
