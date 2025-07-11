class student{
    int rollno;
    String name;
    public student(int rn, String nm){
        rollno = rn;
        name = nm;
    }
    public void displayStudentDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + rollno);
    }
}
class exam extends student{
    int sub1, sub2, sub3;
    public exam(int s1, int s2, int s3, int rn, String nm){
        super(rn, nm);
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }
    public void checkResult(){
        if((sub1 + sub2 + sub3)/3 < 33){
            System.out.println("fail");
        }
        else{
            System.out.println("pass");
        }
    }
}

public class inheritance {
    public static void main(String[] args) {
        exam s1 = new exam(50, 90, 99, 22, "Ansh");
        s1.displayStudentDetails();
        s1.checkResult();
    }
}
