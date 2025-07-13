public class students {
    // instance variables
    String id, name, branch;

    // add students details
    // public void studentDetails(String id, String name, String branch){
    //     this.id = id;
    //     this.name = name;
    //     this.branch = branch;
    // }

    // default constructor
    students(){
        System.out.println("Hello world!");
    }
    // replacing the above method with constructor
    students(String id, String name){
        this();
        this.id = id;
        this.name = name;
        // this.branch = branch;
        System.out.println("Hello Earth!");
    }
    students(String id, String name, String branch){
        this(id, name);
        this.id = id;
        this.name = name;
        this.branch = branch;
        
    }

    // get student details
    public void getStudentDetails(){
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Branch: " + branch);
    }
}
