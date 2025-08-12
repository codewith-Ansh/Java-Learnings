package General;
public class Basic2 {
    String fname = null;
    String lname = null;
    public String setValues(String name1, String name2){
        fname = name1;
        lname = name2;
        return fname + " " + lname;
    }
    void display(){
        System.out.println("First name: " + fname + "\nLast name: " + lname);
    }
}