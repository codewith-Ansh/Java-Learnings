class Demo {
    static int count;
    int id;

    static {
        count = 100;
        System.out.println("Static block executed, count = " + count);
    }

    {
        id = ++count;
        System.out.println("Instance block executed, id = " + id);
    }

    Demo() {
        System.out.println("Constructor executed for id = " + id);
    }
}

public class staticBlock {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
    }
}
