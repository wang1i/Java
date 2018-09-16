package myjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Demo12_13 {

	public static void main(String[] args) throws IOException {
		int characters = 0;
		System.out.println(characters);
		File f = new File(args[0]);
		try (Scanner input = new Scanner(f);) {
			if (!f.exists())
				throw new FileNotFoundException("文件不存在");
			while (input.hasNextLine()) {
				String t = input.nextLine();
				characters += numOfCharacters(t);
			}
		}
		System.out.println("字符数：" + characters);
	}

	private static int numOfCharacters(String t) {
		int num = 0;
		for (int i = 0; i < t.length(); i++)
			if (t.charAt(i) != ' ')
				num++;
		return num;

	}

}
