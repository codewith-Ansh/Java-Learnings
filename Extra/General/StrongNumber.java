
import java.util.Scanner;

public class StrongNumber {
    public static boolean Strong(int n){
        int temp = n;
        int sum = 0;
        
        int digit;
        while (temp != 0) {
            digit = temp%10;
            int mul = 1;
            for(int i=1; i<=digit; i++){
                mul *= i;
            }
            sum += mul;

            temp /= 10;
        }

        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        
        if(Strong(n) == true){
            System.out.println(n + " is a Strong number");
        }
        else{
            System.out.println(n + " is not a Strong number");
        }
    }
}
