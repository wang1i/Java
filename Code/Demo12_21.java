package myjava;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo12_21 {

	public static void main(String[] args) throws IOException {
		File f = new File(args[0]);
		ArrayList<String> list = new ArrayList<>();
		Scanner input = new Scanner(f);
		while (input.hasNext()) {
			list.add(input.next());
		}
		input.close();
		if (Sorted(list))
			System.out.println("…˝–Ú≈≈¡–");
		else {
			String[] a = notSorted(list);
			for (int i = 0; i < 2; i++)
				System.out.println(a[i] + "\t");
		}
	}

	private static String[] notSorted(ArrayList<String> list) {
		String[] a = new String[2];
		for (int i = 0; i < list.size() - 1; i++)
			if (list.get(i).compareTo(list.get(i + 1)) > 0) {
				a[0] = list.get(i);
				a[1] = list.get(i + 1);
			}
		return a;
	}

	private static boolean Sorted(ArrayList<String> list) {
		for (int i = 0; i < list.size() - 1; i++)
			if (list.get(i).compareTo(list.get(i + 1)) > 0)
				return false;
		return true;
	}

}
