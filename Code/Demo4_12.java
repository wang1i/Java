package myjava;

import java.util.Scanner;

public class Demo4_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��ʮ����������");
		String s = input.nextLine();
		char ch = s.charAt(0);
		
		if(ch >= '0' && ch <='9')
			System.out.println("ʮ��������" + ch + "��Ӧ��ʮ�������ǣ�" + (ch - '0'));
		else if(ch >= 'A' && ch <= 'F')
			System.out.println("ʮ��������" + ch + "��Ӧ��ʮ�������ǣ�" + (ch - 'A' + 10));
		else if(ch >= 'a' && ch <= 'f')
			System.out.println("ʮ��������" + ch + "��Ӧ��ʮ�������ǣ�" + (ch - 'a' + 10));
		else 
			System.out.println("����ֵ�Ƿ�");
			

	}

}
