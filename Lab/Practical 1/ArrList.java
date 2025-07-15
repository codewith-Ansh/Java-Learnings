import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        Courses course1 = new Courses("Mathematics", 4);
        Courses course2 = new Courses("Java Programming", 3);
        ArrayList<Courses> arr = new ArrayList<Courses>();
        arr.add(course1);
        arr.add(course2);

        System.out.println(arr);
    }
}
class Courses {
    String courseName;
    int courseCredits;

    Courses(String courseName, int courseCredits) {
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }
    public String toString() {
        return "Course Name: " + courseName + ", Credits: " + courseCredits;
    }
}