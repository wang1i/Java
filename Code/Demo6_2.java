package myjava;

import java.util.Scanner;

public class Demo6_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��������");
		long num = input.nextLong();
		if (num == 0) {
			System.out.println(num + "�ĸ�λ���ֺ�Ϊ��0");
			System.exit(1);
		}
		int res = sumDigits(num);
		System.out.println(num + "�ĸ�λ���ֺ�Ϊ��" + res);
	}

	public static int sumDigits(long n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n = n / 10;
		}
		return sum;
	}
}
