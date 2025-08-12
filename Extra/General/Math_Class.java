package General;
public class Math_Class {
    public static void main(String[] args){
        // Math class
        int a = 100;
        int b = 80;

        System.out.println(Math.max(a, b)); // 100
        System.out.println(Math.min(a, b)); // 80

        System.out.println(Math.random());  // random value b/w 0 to 1
        System.out.println((int)(Math.random()*10));  // integer random value b/w 0 to 10
    }
}
