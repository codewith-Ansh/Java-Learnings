import calc.Addition;
import calc.Division;
import calc.Multiplication;
import calc.Subtraction;

public class accessingPack {
    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println(a.Add(10, 5));

        Subtraction b = new Subtraction();
        System.out.println(b.Sub(10,5));

        Multiplication c = new Multiplication();
        System.out.println(c.Mul(10,5));

        Division d = new Division();
        System.out.println(d.Div(10,5));
    }
}
