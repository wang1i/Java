package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��8������4:15:36
 * @type ��ϰ��
 */
public class Demo7_34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������ַ�����");
		String s = input.nextLine();
		System.out.println("�������ַ����ǣ�" + sort(s));

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
