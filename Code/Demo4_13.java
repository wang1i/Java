package myjava;

import java.util.Scanner;

public class Demo4_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����ĸ��");
		String s = input.nextLine();
		char ch = s.charAt(0);
		if((ch >='A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
			if(ch == 'A' || ch == 'a' || ch== 'E' || ch == 'e' ||ch == 'I' || ch == 'i' || 
				ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u')
				System.out.println(ch +"��Ԫ��");
			else
				System.out.println(ch + "�Ǹ���");
		}
		else
			System.out.println("����ֵ�Ƿ�");

	}

}
