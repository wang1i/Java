package myjava;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Demo12_30 {

	public static void main(String[] args) throws IOException {
		File f = new File(args[0]);
		Scanner input = new Scanner(f);
		int[] a = new int[26];
		while (input.hasNextLine())
			count(input.nextLine(), a);
		input.close();
		for (int i = 0; i < 26; i++)
			System.out.println((char) ('a' + i) + "出现次数：" + a[i]);
	}

	private static void count(String line, int[] a) {
		for (int i = 0; i < line.length(); i++)
			if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z') {
				a[line.charAt(i) - 'a']++;
			}

	}

}
