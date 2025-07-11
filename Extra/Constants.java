public class Constants {
    public static void main (String[] args){
        // constants

        int age = 18;
        age = 19;
        age = age++;

        // but

        // we use "final" keyword for making any value constant
        final float pi = 3.14f;
        // pi = 5.55; // can not change this value
        System.out.println(pi);
    }
}
