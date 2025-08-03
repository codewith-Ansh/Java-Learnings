class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }

    public int hashCode() {
        return name.hashCode();
    }
}

public class HashCode {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ansh");
        Student s2 = new Student(102, "Ravi");
        Student s3 = new Student(101, "Ansh");

        System.out.println("Student 1: " + s1);
        System.out.println("HashCode of s1: " + s1.hashCode());

        System.out.println("\nStudent 2: " + s2);
        System.out.println("HashCode of s2: " + s2.hashCode());

        System.out.println("\nStudent 3: " + s3);
        System.out.println("HashCode of s3: " + s3.hashCode());
    }
}
