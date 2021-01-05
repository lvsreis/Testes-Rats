
import java.io.*;

public class ListFiles {

    public static void main(String args[]) {
	File f = new File(args[0]);
	File inst[];
	try {
	    if(f.isDirectory()) {
		String pth;
		inst = f.listFiles();
		for(int i = 0; i < inst.length; i++) {
		    pth = inst[i].getPath();
		    System.out.println(pth);
		}
	    } else {
		System.out.println(f.getPath());
	    }

	} catch(Exception e) {
	    System.out.println("Deu merda " + e.getMessage());
	}
    }
}

