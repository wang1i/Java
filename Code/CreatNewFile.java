package myjava;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreatNewFile {

	public static void main(String[] args) throws IOException {
		File f1 = new File("scores.txt");
		f1.createNewFile();
		PrintWriter out = new PrintWriter(f1);
		out.print("2/3 2/5 3/5 5/7 7/9");
		out.close();

	}

}
