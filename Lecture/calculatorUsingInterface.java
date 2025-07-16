interface Add {
    void add(int n1, int n2);
}

interface Sub {
    void sub(int n1, int n2);
}

interface Mul {
    void mul(int n1, int n2);
}

interface Div {
    void div(int n1, int n2);
}

class calc1 implements Add, Sub, Mul, Div {
    public void add(int n1, int n2) {
        System.out.println("Addition: " + (n1 + n2));
    }

    public void sub(int n1, int n2) {
        System.out.println("Subtraction: " + (n1 - n2));
    }

    public void mul(int n1, int n2) {
        System.out.println("Multiplication: " + (n1 * n2));
    }

    public void div(int n1, int n2) {
        System.out.println("Division: " + (n1 / n2));
    }
}

public class calculatorUsingInterface {
    public static void main(String[] args) {
        calc1 calculator = new calc1();
        calculator.add(10, 5);
        calculator.sub(10, 5);
        calculator.mul(10, 5);
        calculator.div(10, 5);
    }
}
