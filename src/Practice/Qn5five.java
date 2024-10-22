package Practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Qn5five {
public static void main(String[] args) {
	Path sourcePath = Paths.get("C:\\Users\\Lenovo\\eclipse-workspace\\Java_Practice\\Hello.txt");
	Path destinationPath = Paths.get("C:\\Users\\Lenovo\\eclipse-workspace\\Java_Practice\\src\\Practice\\Hello2.txt");
	
	try {
		Files.copy(sourcePath, destinationPath);
		System.out.println("File succesfully copied to the destined location.");
	}catch(IOException ex){
		System.out.println("File not found.");
	}
}
}
