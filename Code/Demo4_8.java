package myjava;

import java.util.Scanner;

public class Demo4_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������ASCII�루0~127����");
		int num = input.nextInt();
		System.out.println("ASCII��Ϊ" + num + "���ַ��ǣ�" + (char)num);

	}

}
