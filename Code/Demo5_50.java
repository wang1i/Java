package myjava;

import java.util.Scanner;

public class Demo5_50 {

	public static void main(String[] args) {
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("������һ���ַ�����");
		String s = input.nextLine();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				count++;
		}
		System.out.println("��д��ĸ������" + count);

	}

}
