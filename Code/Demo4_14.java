package myjava;

import java.util.Scanner;

public class Demo4_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������A��B��C��D��F��");
		String s = input.nextLine();
		char ch = s.charAt(0);
		if(ch >= 'A' && ch <= 'D')
			System.out.println(ch + "��Ӧ�ȼ�" + (69 - ch));
		else if(ch == 'F')
			System.out.println(ch + "��Ӧ�ȼ�" + "0");
		else
			System.out.println("����ֵ�Ƿ�");

	}

}
