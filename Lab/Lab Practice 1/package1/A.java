package package1;

public class A {
    private int a = 10;
    public int b = 20;
    protected int c = 30;
    int d = 40;

    // Change 'void' to 'public void' to make the method accessible outside the package
    public void methodA() { 
        System.out.println("Inside class A: ");
        System.out.println("value of private variable: " + a);
        System.out.println("value of public variable: " + b);
        System.out.println("value of protected variable: " + c);
        System.out.println("value of default variable: " + d);
    } 
}