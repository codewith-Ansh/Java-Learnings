package General;
class This {
    int x;

    This(int x) {
        this.x = x;  // 'this' refers to the current object
    }

    void display() {
        System.out.println("Value of x: " + this.x);
    }

    public static void main(String[] args) {
        This obj = new This(10);
        obj.display();
    }
}
