package Practice;

import java.io.File;

public class Qn6six {
public static void main(String[] args) {
	File f = new File("Hello.txt");
	
	if(f.delete()) {
		System.out.println("Successfully deleted file.");
	}else {
		System.out.println("Failed to delete file.");
	}
}
}
