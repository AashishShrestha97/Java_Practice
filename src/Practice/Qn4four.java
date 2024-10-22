package Practice;

import java.nio.file.Paths;

public class Qn4four {
public static void main(String[] args) {
	String fileName = Paths.get("Hello.txt").toAbsolutePath().toString();
	
	System.out.println("The filepath of this file is " + fileName);
}
}
