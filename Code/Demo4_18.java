package myjava;

import java.util.Scanner;

public class Demo4_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������Ϣ����һ���ַ���ʾרҵ���ڶ����ַ���ʾ�꼶����");
		String info = input.nextLine();
		char ch1 = info.charAt(0);
		char ch2 = info.charAt(1);
		if(ch1 == 'M')
			System.out.print("��ѧ");
		else if(ch1 == 'C')
			System.out.print("�������ѧ");
		else if(ch1 == 'I')
			System.out.print("��Ϣ����");
		else {
			System.out.println("����Ƿ�");
		    System.exit(1);
		}
		if(ch2 =='1')
			System.out.println("  ��һ");
		else if(ch2 =='2')
			System.out.println("  ���");
		else if(ch2 == '3')
			System.out.println("  ����");
		else if(ch2 == '4')
			System.out.println("  ����");
		else
			System.out.println("����Ƿ�");

	}

}
