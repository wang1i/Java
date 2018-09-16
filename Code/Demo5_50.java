package myjava;

import java.util.Scanner;

public class Demo5_50 {

	public static void main(String[] args) {
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一串字符串：");
		String s = input.nextLine();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				count++;
		}
		System.out.println("大写字母个数：" + count);

	}

}
