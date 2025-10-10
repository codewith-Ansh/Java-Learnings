import java.nio.file.*;
import java.io.IOException;

public class SimpleNIOFile {
    public static void main(String[] args) {
        Path path = Paths.get("sample.txt");
        try {
            Files.writeString(path, "First Java NIO Program!");
            String data = Files.readString(path);
            System.out.println("File Content:");
            System.out.println(data);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
