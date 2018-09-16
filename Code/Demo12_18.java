package myjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Demo12_18 {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File(args[0]);
		PrintWriter output = new PrintWriter(f);
		output.println("package myjava;");
		output.close();
		Scanner input = new Scanner(f);
		System.out.println(input.next());
		input.close();

	}

}
