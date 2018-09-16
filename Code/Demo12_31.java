package myjava;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Demo12_31 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.print("输入年份：");
		String year = in.next();
		System.out.print("输入性别：");
		String gender = in.next();
		System.out.print("输入名字：");
		String name = in.next();
		SearchRank(args[0], year, gender, name);
		in.close();
	}

	private static void SearchRank(String dirPath, String year, String gender, String name) throws IOException {
		File dir = new File(dirPath);
		File[] subfiles = dir.listFiles();
		File f = dir;
		int flag = 0;
		for (File subf : subfiles) {
			if (subf.getName().contains(year)) {
				f = subf;
				break;
			}
		}
		int rank = 0;
		Scanner input = new Scanner(f);
		while (input.hasNextLine()) {
			rank++;
			String line = input.nextLine();
			int index = 0;
			int count = 0;
			while (count < 3) {
				if (line.charAt(index) == ' ')
					count++;
				index++;
			}
			if (gender.compareTo("F") == 0 && line.substring(1, index).contains(name)) {
				System.out.println(name + "于" + year + "年排名" + rank + "名");
				flag = 1;
			}
			if (gender.compareTo("M") == 0 && line.substring(index).contains(name)) {
				System.out.println(name + "于" + year + "年排名" + rank + "名");
				flag = 1;
			}

		} // while
		if (flag == 0)
			System.out.println("查无此人");
		input.close();
	}

}
