import java.util.Objects;

public class student {
    String id, name, branch;
    double cgpa;

    // Constructor
    student(String id, String name, String branch, double cgpa) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.cgpa = cgpa;
    }

    // Inner Class - Course
    public class Course {
        String courseName;
        int courseCredits;

        Course(String courseName, int courseCredits) {
            this.courseName = courseName;
            this.courseCredits = courseCredits;
        }

        void showCourse() {
            System.out.println("Course: " + courseName + ", Credits: " + courseCredits);
        }
    }

    // Method-local Inner Class - Semester-wise enrollment
    public void enrollInSemester(int sem, String courseName, int credits) {
        class Semester {
            void enroll() {
                System.out.println(name + " enrolled in Semester " + sem);
                Course c = new Course(courseName, credits);
                c.showCourse();
            }
        }

        Semester semester = new Semester();
        semester.enroll();
    }

    // Simple scholarship check
    public void checkScholarshipEligibility() {
        System.out.println("Checking scholarship eligibility for " + name);
        if (cgpa >= 8.0) {
            System.out.println("Eligible for Scholarship");
        } else {
            System.out.println("Not Eligible for Scholarship");
        }
    }

    // Override toString()
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Branch: " + branch + ", CGPA: " + cgpa;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        student other = (student) obj;
        return Objects.equals(id, other.id);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Main Method
    public static void main(String[] args) {
        student s1 = new student("22", "Ansh Darji", "CE", 8.5);
        student s2 = new student("150", "Jay parmar", "Civil", 7.5);
        student s3 = new student("07", "Vraj Baria", "BCA", 9.1);
        student s4 = new student("22", "Ansh Darji", "CE", 8.5);

        // Display details
        System.out.println(s1);
        System.out.println("s1 equals s2? " + s1.equals(s2));
        System.out.println("s1 equals s4? " + s1.equals(s4));

        System.out.println("HashCodes:");
        System.out.println("s1.hashCode(): " + s1.hashCode());
        System.out.println("s2.hashCode(): " + s2.hashCode());
        System.out.println("s3.hashCode(): " + s3.hashCode());
        System.out.println("s4.hashCode(): " + s4.hashCode());

        System.out.println("------------------ ENROLLMENT ------------------");
        s1.enrollInSemester(3, "OOP", 4);
        s2.enrollInSemester(3, "Mathematics", 3);

        System.out.println("-------------- SCHOLARSHIP CHECK ---------------");
        s1.checkScholarshipEligibility();
        s2.checkScholarshipEligibility();
        s3.checkScholarshipEligibility();
    }
}