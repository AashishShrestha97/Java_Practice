package Practice;

import java.io.File;
import java.io.IOException;

public class Qn1one {
public static void main(String[] args) {
	File f = new File("Hello.txt");
	
	try {
		if(f.createNewFile()) {
			System.out.println("File created.");
		}else {
			System.out.println("File failed to create.");
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
