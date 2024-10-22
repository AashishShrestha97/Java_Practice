package Practice;

import java.io.File;
import java.io.IOException;

public class Qn7seven {
public static void main(String[] args) {
	for(int i = 1; i<=100; i++) {
	  fileDelete("Hello" + i + ".txt");
	}
}

public static void createFile(String file) {
	File f = new File(file);
	try {
		if(f.createNewFile()) {
			System.out.println("Files created succesfully.");
		}else {
			System.out.println("Files failed to create.");
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void fileDelete(String file) {
	File f = new File(file);
	if(f.delete()) {
		System.out.println("Successfully deleted file.");
	}else {
		System.out.println("Failed to delete file.");
	}
}
}
