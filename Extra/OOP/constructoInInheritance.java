class Base{
    private int n;
    Base(){
        System.out.println("I am a Base constructor");
    }

    Base(int n){
        this.n = n;
        System.out.println("I am a base constructor with value: " + n);
    }

    Base(Base obj){
        this.n = obj.n;
        System.out.println("I am a copy constructor");
    }
}

class Child extends Base{
    int m;
    Child(){
        System.out.println("I am a Child constructor");
    }
    Child(int n, int m){
        super(n);
        this.m = m;
        System.out.println("I am a Child constructor with value: " + m);
    }

    Child(Child obj){
        super(obj);
        this.m = obj.m;
        System.out.println("I am a copy constructor");
    }
}

public class constructoInInheritance {
    public static void main(String[] args) {
        Base obj = new Child();
        Child c = new Child(10, 20);
    }
}
