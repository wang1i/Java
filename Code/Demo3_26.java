package myjava;

import java.util.Scanner;

public class Demo3_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��������");
		int num = input.nextInt();
		
		if(num % 5 == 0 || num % 6 == 0)
			System.out.println(num + "�ܱ�5��6������ ��ȷ");
		else
			System.out.println(num + "�ܱ�5��6������ ����");
		
		if(num % 5 == 0 && num % 6 == 0)
			System.out.println(num + "�ܱ�5��6������ ��ȷ");
		else {
			System.out.println(num + "�ܱ�5��6������ ����");
			if(num % 5 == 0 || num % 6 == 0)
				System.out.println(num + "�ܱ�5��6����������ͬʱ�� ��ȷ");
			else
				System.out.println(num + "�ܱ�5��6����������ͬʱ�� ����");
		}
		

	}

}
