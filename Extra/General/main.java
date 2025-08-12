package General;
public class main {
    public static void main(String[] args) {
        // object student
        students s1 = new students("24CE022", "Ansh Darji", "Cspit CE");

        // using the methods of the student class
        // s1.studentDetails("24CE022", "Ansh Darji", "Cspit CE");
        s1.getStudentDetails();
    }
}