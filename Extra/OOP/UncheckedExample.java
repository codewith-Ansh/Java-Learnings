class UncheckedExample {
    public static void main(String[] args) {
        int a = 10 / 0;  // ArithmeticException
        String s = null;
        System.out.println(s.length());  // NullPointerException
    }
}
