package myjava;

import java.util.Scanner;

public class Demo6_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入密码：");
		String code = input.nextLine();
		if (isValidCode(code))
			System.out.println("有效密码");
		else
			System.out.println("无效密码");

	}

	public static boolean isValidCode(String code) {
		char ch;
		int digitCount = 0;
		if (code.length() < 8)
			return false;
		for (int i = 0; i < code.length(); i++) {
			ch = code.charAt(i);
			if (ch >= '0' && ch <= '9')
				digitCount++;
			else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				;
			else
				return false;
		}
		if (digitCount >= 2)
			return true;
		return false;
	}

}
