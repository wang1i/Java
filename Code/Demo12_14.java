package myjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo12_14 {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File(args[0]);
		try (Scanner fread = new Scanner(f);) {
			double sum = 0;
			int num = 0;
			while (fread.hasNext()) {
				num++;
				String t = fread.next();
				sum += value(t);
				System.out.println(t);
			}
			System.out.println("和：" + sum + "\n平均值：" + (sum / num));
		}

	}

	private static double value(String t) {

		return (double) (t.charAt(0) - '0') / (double) (t.charAt(2) - '0');
	}

}
