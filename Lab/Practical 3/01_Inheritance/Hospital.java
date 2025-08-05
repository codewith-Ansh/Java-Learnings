class Staff {
    String name;
    int age;
    String position;
    public static final String financeTeam = "Finance Team";

    public Staff(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public void work() {
        System.out.println(name + " is working as " + position);
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Position: " + position);
    }
}

class Doctor extends Staff {
    String specialization;

    public Doctor(String name, int age, String position, String specialization) {
        super(name, age, position);
        this.specialization = specialization;
    }

    @Override
    public void work() {
        System.out.println(name + " is working as " + position + " specializing in " + specialization);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}

class Nurse extends Staff {
    public Nurse(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void work() {
        System.out.println(name + " is working as " + position);
    }
}

class AdministrativeStaff extends Staff {
    public AdministrativeStaff(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void work() {
        System.out.println(name + " is working as " + position + " in " + financeTeam);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + financeTeam);
    }
}

public class Hospital {
    public static void main(String[] args) {
        Staff doctor = new Doctor("Dr. Ansh", 19, "Doctor", "Cardiology");
        Staff nurse = new Nurse("Krish", 30, "Nurse");
        Staff admin = new AdministrativeStaff("Vedant", 25, "Administrative Staff");

        doctor.displayDetails();
        doctor.work();
        System.out.println();

        nurse.displayDetails();
        nurse.work();
        System.out.println();

        admin.displayDetails();
        admin.work();
    }
}