package myjava;

import java.util.Scanner;

public class Demo4_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��ĸ��");
		String s = input.nextLine();
		char ch = s.charAt(0);
		 
		if((ch >= 'A' && ch <= 'C') || (ch >='a' && ch <= 'c'))
			System.out.println("��Ӧ��ͨѶ����Ϊ2");
		else if((ch >= 'D' && ch <= 'F') || (ch >='d' && ch <= 'f'))
			System.out.println("��Ӧ��ͨѶ����Ϊ3");
		else if((ch >= 'G' && ch <= 'H') || (ch >='g' && ch <= 'h'))
			System.out.println("��Ӧ��ͨѶ����Ϊ4");
		else if((ch >= 'J' && ch <= 'L') || (ch >='j' && ch <= 'l'))
			System.out.println("��Ӧ��ͨѶ����Ϊ5");
		else if((ch >= 'M' && ch <= 'O') || (ch >='m' && ch <= 'o'))
			System.out.println("��Ӧ��ͨѶ����Ϊ6");
		else if((ch >= 'P' && ch <= 'S') || (ch >='p' && ch <= 's'))
			System.out.println("��Ӧ��ͨѶ����Ϊ7");
		else if((ch >= 'T' && ch <= 'V') || (ch >='t' && ch <= 'v'))
			System.out.println("��Ӧ��ͨѶ����Ϊ8");
		else if((ch >= 'W' && ch <= 'Z') || (ch >='w' && ch <= 'z'))
			System.out.println("��Ӧ��ͨѶ����Ϊ9");
		else
			System.out.println("����ֵ�Ƿ�");
		

	}

}
