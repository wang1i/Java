package myjava;

import java.util.Scanner;

public class Demo5_48 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("ÇëÊäÈëÒ»´®×Ö·û´®£º");
		String s = input.nextLine();
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0)
				System.out.print(s.charAt(i));
		}

	}

}
