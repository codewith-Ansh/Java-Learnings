import java.io.*;

class CheckedExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file.txt"); // File may not exist
            fr.read();
        } catch (IOException e) {  // Must handle
            System.out.println("File error: " + e);
        }
    }
}
