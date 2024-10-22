package Practice;

import java.io.FileWriter;
import java.io.IOException;

public class Qn2two {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("Hello.txt")) {
            writer.write("Aashish Shrestha\n");
            System.out.println("Successfully added the name to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
