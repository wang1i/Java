package myjava;

import java.util.Scanner;

public class Demo6_21 {

	public static void main(String[] args) {
		char ch;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入字符串形式的电话号码：");
		String s = input.nextLine();
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				System.out.print(getNumber(ch));
			else
				System.out.print(ch);
		}

	}

	public static int getNumber(char ch) {
		int result = 0;
		if ((ch >= 'a' && ch <= 'c') || (ch >= 'A' && ch <= 'C'))
			result = 1;
		// 略
		return result;
	}

}
