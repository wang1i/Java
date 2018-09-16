package myjava;

import java.util.Scanner;

public class Demo6_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("ÇëÊäÈë×Ö·û´®£º");
		String str = input.nextLine();
		System.out.println("×Ö·û´®ÖĞ×ÖÄ¸¸öÊı£º" + countLetters(str));

	}

	private static int countLetters(String s) {
		char ch;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				count++;
		}
		return count;
	}

}
