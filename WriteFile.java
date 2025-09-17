import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("example.txt");
            fw.write("Hello, this is Java File Handling!");
            fw.close();
            System.out.println("Successfully written.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
