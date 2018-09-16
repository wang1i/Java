package myjava;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Demo12_15 {

	public static void main(String[] args) throws IOException {
		File f = new File("Exercise12_15");
		if (!f.exists())
			f.createNewFile();
		try (PrintWriter fwrite = new PrintWriter(f);) {
			int[] a = new int[10];
			for (int i = 0; i < 10; i++) {
				int t = (int) (Math.random() * 1000);
				fwrite.print(t);
				a[i] = t;
			}
			Arrays.sort(a);
			for (int i = 0; i < 10; i++)
				System.out.print(a[i] + " ");
		}
	}

}
