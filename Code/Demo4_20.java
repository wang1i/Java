package myjava;

import java.util.Scanner;

public class Demo4_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("����һ�ַ�����");
		String s = input.nextLine();
		System.out.println("�ַ�������Ϊ��" + s.length() + "\n" + "�ַ������ַ�Ϊ��" + s.charAt(0));

	}

}
