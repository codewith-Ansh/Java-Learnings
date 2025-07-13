class simpleInterest{
    double p,r,t;
    double calculateInterest(){
        return (p*r*t)/100;
    }
}
class maxNum{
    int n1,n2,n3;
    int maxNumber(){
        if(n1>n2){
            if(n1>n3)
                return n1;
            else
                return n3;
        }
        else{
            if(n2>n3)
                return n2;
            else
                return n3;
        }
    }
}

public class Task {
    public static void main(String[] args) {
        simpleInterest si = new simpleInterest();
        si.p = 15000;
        si.r = 0.18;
        si.t = 12;
        System.out.println(si.calculateInterest());

        maxNum number = new maxNum();
        number.n1 = 15;
        number.n2 = 50;
        number.n3 = 40;
        System.out.println(number.maxNumber());
    }
}
