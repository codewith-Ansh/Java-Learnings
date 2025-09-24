// package FileHandling;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("C:\\Users\\ANSH DARJI\\OneDrive\\Desktop\\Java\\Java-Learnings\\Lecture\\FileHandling\\abc.txt");
        System.out.println(p.getFileName());
        System.out.println(p.endsWith("abc.txt"));
        System.out.println(p.getName(3));
        
        FileReader fr = new FileReader(p.toString());
        int ch;

        while((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }

        fr.close();
    }
}
