package myjava;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo12_20 {
	private static int num = 0;

	public static void main(String[] args) throws IOException {
		String filePath = args[0];
		editProperties(filePath);
		System.out.println("ÎÄ¼þÊý£º" + num);
	}

	private static void editProperties(String filePath) throws IOException {
		File file = new File(filePath);
		if (file.isFile())
			if (file.getName().matches("Test.*")) {
				num++;
				System.out.println(file.getAbsolutePath());
				editFile(file.getAbsolutePath());
			}
		if (file.isDirectory()) {
			File[] subFiles = file.listFiles();
			for (File subFile : subFiles)
				editProperties(subFile.getAbsolutePath());
		}
	}

	private static void editFile(String filePath) throws IOException {
		File f = new File(filePath);
		Scanner input = new Scanner(f);
		ArrayList<String> list = new ArrayList<>();
		while (input.hasNextLine()) {
			list.add(input.nextLine());
		}
		input.close();
		PrintWriter output = new PrintWriter(f);
		output.println("package myjava;");
		for (int i = 0; i < list.size(); i++)
			output.println(list.get(i));
		output.close();
	}

}
