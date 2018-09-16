package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年4月24日下午7:57:35
 * @type 练习题
 */
public class Demo6_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入字符串：");
		String str = input.nextLine();
		System.out.print("请输入字符：");
		String s = input.nextLine();
		char ch = s.charAt(0);
		System.out.println(ch + "在" + str + "中出现" + count(str, ch) + "次");

	}

	private static int count(String str, char ch) {
		char c;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c == ch)
				count++;
		}
		return count;
	}

}
