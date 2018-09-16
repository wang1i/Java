package myjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo12_17 {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File(args[0]);
		Scanner input = new Scanner(f);
		Scanner in = new Scanner(System.in);
		int mistakes = 0;
		char flag = 'n';
		do {
			String answer = input.next();
			String s1 = setRiddle(answer, ' ');
			while (s1.compareTo(answer) != 0) {
				System.out.print("（猜谜）输入猜测的字母：" + s1 + "  ");
				String guess = in.next();
				char gue = guess.charAt(0);

				if (!contains(answer, gue)) {
					mistakes++;
					System.out.println(gue + "不在单词中");
				} else if (contains(s1, gue)) { // 字母在单词中而也在猜过的序列中
					System.out.println(gue + "已存在单词中");
				}
				s1 = setRiddle(answer, s1, gue);
			}

			System.out.println("单词是" + answer + "\t你猜错了" + mistakes + "次");
			System.out.print("继续猜单词? 输入Y/N：");
			flag = in.next().charAt(0);
			mistakes = 0;

		} while (flag == 'Y' || flag == 'y');

		input.close();
		in.close();
	}

	private static String setRiddle(String answer, String s1, char gue) {
		char[] a = new char[s1.length()];
		for (int i = 0; i < s1.length(); i++) {
			if (gue == answer.charAt(i))
				a[i] = gue;
			else
				a[i] = s1.charAt(i);
		}
		return String.copyValueOf(a);
	}

	private static boolean contains(String s, char ch) {
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == ch)
				return true;
		return false;
	}

	private static String setRiddle(String answer, char ch) {
		char[] a = new char[answer.length()];
		for (int i = 0; i < answer.length(); i++)
			if (answer.charAt(i) == ch)
				a[i] = ch;
			else
				a[i] = '*';
		return String.copyValueOf(a);
	}

}
