import java.util.ArrayList;
import java.util.Collections;

public class UtilPackageDemo {
    public static void main(String[] args) {
        System.out.println("--- java.util Demonstration ---");
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        System.out.println("Original List: " + languages);
        Collections.sort(languages);
        System.out.println("Sorted List: " + languages);
    }
}