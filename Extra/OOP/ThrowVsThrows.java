class ThrowVsThrows {

    // Method using 'throws' - it declares that it may throw an exception
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            // 'throw' is used to actually throw the exception
            throw new ArithmeticException("You must be at least 18 years old!");
        } else {
            System.out.println("Welcome! You are eligible.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }

        checkAge(20);
    }
}
