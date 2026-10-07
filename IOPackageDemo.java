import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class IOPackageDemo {
    public static void main(String[] args) {
System.out.println("....java.io demonstration...");
String filename = "sample.txt";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello! This file was created using the java.io package");
            System.out.println("Successfully written to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred during file writing: " + e.getMessage());
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
System.out.println("Reading file content:");
 while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred during file reading: " + e.getMessage());
        }
    }
}