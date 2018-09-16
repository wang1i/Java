package myjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Demo12_16 {

	public static void main(String[] args) throws FileNotFoundException {
		File oldFile = new File(args[0]);
		File newFile = new File(args[1]);
		try (Scanner input = new Scanner(newFile); PrintWriter output = new PrintWriter(oldFile);) {
			while (input.hasNext()) {
				String s1 = input.next();
				String s2 = s1.replaceAll(args[2], args[3]);
				output.println(s2);
			}
		}
		Scanner input2 = new Scanner(oldFile);
		System.out.println(input2.next());
		input2.close();
	}

}
