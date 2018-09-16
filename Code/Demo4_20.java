package myjava;

import java.util.Scanner;

public class Demo4_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("输入一字符串：");
		String s = input.nextLine();
		System.out.println("字符串长度为：" + s.length() + "\n" + "字符串首字符为：" + s.charAt(0));

	}

}
