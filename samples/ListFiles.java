import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
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
		    if(inst[i].isDirectory())
		    {
		    	System.out.println("Entrei aqui\n");
		    }

		    else
		    {
		    	System.out.println(pth);
		    }
		}
	    } else {
		System.out.println(f.getPath());
	    }

	} catch(Exception e) {
	    System.out.println("Deu merda " + e.getMessage());
	}
    }
}

