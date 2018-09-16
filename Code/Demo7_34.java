package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月8日下午4:15:36
 * @type 练习题
 */
public class Demo7_34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入字符串：");
		String s = input.nextLine();
		System.out.println("排序后的字符串是：" + sort(s));

	}

	private static String sort(String s) {
		char[] a = new char[s.length()];
		String str = "";
		int i, j = 0;
		for (i = 0; i < s.length(); i++)
			a[i] = s.charAt(i);
		for (i = 0; i < s.length() - 1; i++) {
			for (j = s.length() - 1; j > 0; j--)
				if (a[j] < a[j - 1]) {
					char ch = a[j];
					a[j] = a[j - 1];
					a[j - 1] = ch;
				}
		}
		for (i = 0; i < s.length(); i++)
			str += a[i];

		return str;
	}

}
