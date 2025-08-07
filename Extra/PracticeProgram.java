import java.util.Scanner;

class PracticeProgram {
    int number;

    PracticeProgram(int number) {
        this.number = number;
    }

    void checkPalindrome() {
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        PracticeProgram pp = new PracticeProgram(input);
        pp.checkPalindrome();

        scanner.close();
    }
}
