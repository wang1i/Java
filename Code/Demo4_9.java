package myjava;

import java.util.Scanner;

public class Demo4_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������ַ���");
		String str = input.nextLine();
		char ch = str.charAt(0);
		System.out.println("�ַ�" + ch + "��ASCII����ֵΪ��" + (ch - 'A' + 65));

	}

}
