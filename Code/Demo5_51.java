package myjava;

import java.util.Scanner;

public class Demo5_51 {

	public static void main(String[] args) {
		int i, j;
		Scanner input = new Scanner(System.in);
		System.out.print("�������ַ���1��");
		String s1 = input.nextLine();
		System.out.print("�������ַ���2��");
		String s2 = input.nextLine();
		for (i = 0; i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i); i++)
			;
		if (i > 0) {
			System.out.println("���ͬǰ׺�ǣ�");
			for (j = 0; j < i; j++)
				System.out.print(s1.charAt(j));
			System.out.println();
		} else
			System.out.println(s1 + "��" + s2 + "�޹�ͬǰ׺");

	}

}
