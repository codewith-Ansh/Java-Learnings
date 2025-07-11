public class Operators {
    public static void main(String[] args){
        int sum = 10 + 5;
        int dif = 10 - 5;
        int mul = 10 * 5;
        int div = 10 / 5;
        int rem = 10 % 5;

        System.out.println(sum);    // 15
        System.out.println(dif);    // 5
        System.out.println(mul);    // 50
        System.out.println(div);    // 2
        System.out.println(rem);    // 0

        int num = 2;
        System.out.println(num++);  // 2
        System.out.println(++num);  // 4
        System.out.println(num--);  // 4
        System.out.println(--num);  // 2
    }
}
