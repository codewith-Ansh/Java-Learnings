interface A{
    public void display(int a);
}
interface B extends A{
    public void display(float b);
}
interface C extends A{
    public void display(double c);
}
interface D extends B, C{
    public void display(long d);
}
class E implements D{
    public void display(int a) {
        System.out.println("Integer: " + a);
    }
    public void display(float b) {
        System.out.println("Float: " + b);
    }
    public void display(double c) {
        System.out.println("Double: " + c);
    }
    public void display(long d) {
        System.out.println("Long: " + d);
    }
    public void calc(int a, float b, double c, long d) {
        System.out.println("Calculating with: " + a*b*c*d);
    }
}
public class interfaceProgram {
    public static void main(String[] args) {
        E obj = new E();
        obj.display(20);
        obj.display(12.5f);
        obj.display(12.5);
        obj.display(50L);
        obj.calc(20, 12.5f, 12.5, 50L);
    }
}