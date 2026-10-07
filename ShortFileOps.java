import java.io.IOException;
import java.nio.file.*;

public class ShortFileOps {
    public static void main(String[] args) {
        Path path = Paths.get("demo.txt");
        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
                System.out.println("File created successfully.");
            }
            Files.write(path, "Java File Operations Demo.".getBytes());
            System.out.println("Data written to file.");
            String content = new String(Files.readAllBytes(path));
            System.out.println("File Content: " + content);
            Files.delete(path);
            System.out.println("File deleted successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
