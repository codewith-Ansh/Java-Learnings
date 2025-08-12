package General;
import java.util.Scanner;

class Armstrong {
    int number;

    Armstrong(int number) {
        this.number = number;
    }

    void checkArmstrong() {
        int original = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }

        if (original == sum) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int input = scanner.nextInt();

        Armstrong obj = new Armstrong(input);
        obj.checkArmstrong();

        scanner.close();
    }
}
