class ExceptionThrow {
    void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote, age must be 18 or above.");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args) {
        ExceptionThrow obj = new ExceptionThrow();

        obj.checkAge(20);

        obj.checkAge(15);
    }
}
