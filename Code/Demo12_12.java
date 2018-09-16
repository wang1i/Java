package myjava;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Demo12_12 {

	public static void main(File args) throws IOException {
		File newFile = new File("CodeStyle"); 
		try(Scanner in = new Scanner(args);
				PrintWriter out = new PrintWriter(newFile);
			){
			while (in.hasNextLine()) {
				String t = in.nextLine();
				if (t.compareTo("{") == 0) {
				  out.print(t);
				  System.out.print(t);
				}
				System.out.println("}");
			}
		}

	}

}
