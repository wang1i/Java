package myjava;

import java.util.Scanner;

public class Demo6_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��������");
		int num = input.nextInt();
		if (num == 0) {
			System.out.println(num + "�ķ�����Ϊ0");
			System.exit(1);
		}
		System.out.println(num + "�ķ�����Ϊ��" + reverse(num));

	}

	public static int reverse(int num) {
		int result = 0;
		while (num > 0) {
			result = result * 10 + num % 10;
			num = num / 10;
		}
		return result;
	}

}
