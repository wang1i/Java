package myjava;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo12_32 {

	public static void main(String[] args) throws IOException {
		System.out.println("Year\t" + "Rank1\tRank2\tRank3\tRank4\tRank5\tRank6");
		System.out.print("2018\t");
		printRank(args[0], "2018");
	}

	private static void printRank(String dirPath, String year) throws IOException {
		File dir = new File(dirPath);
		File[] subfiles = dir.listFiles();
		File f = dir;
		for (File subf : subfiles) {
			if (subf.getName().contains(year)) {
				f = subf;
				break;
			}
		} // for
		ArrayList<Rank> list = new ArrayList<>();
		Scanner input = new Scanner(f);
		for (int k = 0; k < 3; k++) {
			String line = input.nextLine();
			String nM = line.substring(getSpaceIndex(line, 1) + 1, getSpaceIndex(line, 2));
			String dM = line.substring(getSpaceIndex(line, 2) + 1, getSpaceIndex(line, 3));
			String nF = line.substring(getSpaceIndex(line, 3) + 1, getSpaceIndex(line, 4));
			String dF = line.substring(getSpaceIndex(line, 4) + 1);
			list.add(new Rank(nM, Double.parseDouble(dM)));
			list.add(new Rank(nF, Double.parseDouble(dF)));
		}
		input.close();
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = list.size() - 1; j > i; j--) {
				if (list.get(j).num > list.get(j - 1).num) {
					Rank temp = list.get(j);
					list.set(j, list.get(j - 1));
					list.set(j - 1, temp);
				}
			}
		}
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i).name + "\t");

	}

	private static int getSpaceIndex(String line, int n) {
		int index = -1;
		int count = 0;
		while (count < n) {
			index++;
			if (line.charAt(index) == ' ')
				count++;
		}
		return index;
	}

}// Ö÷Àà

class Rank {
	String name;
	double num;

	Rank(String name, double num) {
		this.name = name;
		this.num = num;
	}
}// class Rank
