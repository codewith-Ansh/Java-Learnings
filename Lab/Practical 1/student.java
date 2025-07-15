import java.util.Objects;

public class student {
    String id, name, branch;

    student(String id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    public void addCourse(String courseName, int courseCredits) {
        course newCourse = new course(courseName, courseCredits);
        System.out.println("Added Course: " + newCourse.courseName + " with Credits: " + newCourse.courseCredits);
    }

    public void enrollSemester(String courseName, int courseCredits) {
        course newCourse = new course(courseName, courseCredits);
        System.out.println("Enrolled in Course: " + newCourse.courseName + " with Credits: " + newCourse.courseCredits);
    }

    public void checkScholarshipEligibility() {
        System.out.println("Checking scholarship eligibility for student: " + name);
        // Logic to check scholarship eligibility can be added here
    }

    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Branch: " + branch);
        System.out.println("-------------------------");
    }

    public String toString() {
        return ("ID: " + id + ", Name: " + name + ", Branch: " + branch);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true; // Check if both references point to the same object
        if (obj == null || getClass() != obj.getClass())
            return false; // Check for null and class type
        student other = (student) obj; // Cast to student type
        return Objects.equals(id, other.id); // Compare based on id
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public class course {
        String courseName;
        int courseCredits;

        course(String courseName, int courseCredits) {
            this.courseName = courseName;
            this.courseCredits = courseCredits;
        }
    }

    public static void main(String[] args) {
        student s1 = new student("22", "Ansh Darji", "CE");
        student s2 = new student("150", "Narendra Modi", "Civil");
        student s3 = new student("07", "Mahendra singh Dhoni", "BCA");
        student s4 = new student("22", "Ansh Darji", "CE");

        // System.out.println(s1);
        s1.displayDetails();
        System.out.println("s1 equals s2? " + s1.equals(s2));
        System.out.println("s1 equals s4? " + s1.equals(s4));
        System.out.println("-------------------------");

        // checking the hashcode
        System.out.println("s1.hashCode(): " + s1.hashCode());
        System.out.println("s2.hashCode(): " + s2.hashCode());
        System.out.println("s3.hashCode(): " + s3.hashCode());
        System.out.println("s4.hashCode(): " + s4.hashCode());
    }
}