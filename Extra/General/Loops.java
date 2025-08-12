package General;
public class Loops {
    public static void main(String[] args) {
        for(int i=0;i<=100;i=i+2){
            System.out.println(i);
        }

        int i = 0;
        while (true) {
            i--;
            System.out.println(i);
            if(i==-100)
                break;
        }
        int num = 100;
        do{
            System.out.println(num);
            num = num - 5;
        }while(num!=5);
    }
}
