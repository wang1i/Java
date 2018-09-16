package myjava;

import java.util.Scanner;

public class Demo4_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入字符：");
		String str = input.nextLine();
		char ch = str.charAt(0);
		System.out.println("字符" + ch + "的ASCII码数值为：" + (ch - 'A' + 65));

	}

}
