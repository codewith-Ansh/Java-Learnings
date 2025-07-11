class Bank{
    int r;
    Bank(int iR){
        r = iR;
    }
}

class Branch extends Bank{
    int n, t;
    Branch(int n, int t, int ir){
        super(ir);
        this.n = n;
        this.t = t;
    }
}

class Client extends Branch{
    int P, A;
    Client(int P, int n, int t, int ir){
        super(n, t, ir);
        this.P = P;
    }
    void calculateCompoundInterest(){
        double A = P * Math.pow((1 + (r / n)), n * t);
        System.out.println("Compound Interest: " + A);
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        Client c = new Client(80000, 12, 18, 15);
        c.calculateCompoundInterest();
    }
}