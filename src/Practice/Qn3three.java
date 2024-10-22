package Practice;

import java.io.FileWriter;
import java.io.IOException;

public class Qn3three {
    public static void main(String[] args) {
        writeContent("Yes I am Aashish Shrestha and I am 20 years old.");
    }

    public static void writeContent(String content) {
        try (FileWriter f = new FileWriter("Hello.txt", true)) {
            f.write(content + "\n"); 
            System.out.println("Content added successfully.");
        } catch (IOException ex) {
            System.out.println("File does not exist or an error occurred.");
        }
    }
}

// By this method the content written on the file will be overwritten.
//public class Qn3three {
//    public static void main(String[] args) {
//        writeContent("Yes I am Aashish Shrestha and I am 20 years old.");
//    }
//
//    public static void writeContent(String content) {
//        try (FileWriter f = new FileWriter("Hello.txt")) {
//            f.write(content + "\n"); 
//            System.out.println("Content added successfully.");
//        } catch (IOException ex) {
//            System.out.println("File does not exist or an error occurred.");
//        }
//    }
//}

