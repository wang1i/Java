package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��4��24������7:57:35
 * @type ��ϰ��
 */
public class Demo6_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������ַ�����");
		String str = input.nextLine();
		System.out.print("�������ַ���");
		String s = input.nextLine();
		char ch = s.charAt(0);
		System.out.println(ch + "��" + str + "�г���" + count(str, ch) + "��");

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
