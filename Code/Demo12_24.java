package myjava;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo12_24 {

	public static void main(String[] args) throws IOException {
		File f = new File("Salary.txt");
		f.createNewFile();
		PrintWriter output = new PrintWriter(f);
		for (int i = 0; i < 1000; i++) {
			output.print("FirstName" + i + " " + "LastName" + i + " ");
			int random = (int) (Math.random() * 3);
			if (random == 0)
				output.println("assistant" + " " + String.format("%.2f", (Math.random() * 30000 + 50000)));
			if (random == 1)
				output.println("associate" + " " + String.format("%.2f", (Math.random() * 50000 + 60000)));
			if (random == 2)
				output.println("full" + " " + String.format("%.2f", (Math.random() * 55000 + 75000)));
		}
		output.close();
	}

}
