package myjava;

import java.util.Scanner;

public class Demo6_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��������");
		int num = input.nextInt();
		if (num == 0) {
			System.out.println(num + "�ǻ�����");
			System.exit(1);
		}
		if (isPalindrom(num))
			System.out.println(num + "�ǻ�����");
		else
			System.out.println(num + "���ǻ�����");

	}

	public static boolean isPalindrom(int num) {
		int rev = reverse(num);
		if (rev == num)
			return true;
		else
			return false;
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
