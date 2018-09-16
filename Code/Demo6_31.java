package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��4��25������7:02:56
 * @type ��ϰ��
 */
public class Demo6_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�����뿨�ţ�");
		long num = input.nextLong();
		if (isValid(num))
			System.out.println("���źϷ�");
		else
			System.out.println("���ŷǷ�");

	}

	private static boolean isValid(long num) {
		if ((sumOfDoubleEvenPlace(num) + sumOfOddPlace(num)) % 10 == 0)
			return true;
		return false;
	}

	private static long sumOfDoubleEvenPlace(long num) {
		long sum = 0, d, d1, d2, i = 1;
		while (num > 0) {
			if (i % 2 == 0) {
				d = (num % 10) * 2;
				if (d < 10)
					sum += d;
				else {
					d1 = d / 10;
					d2 = d % 10;
					sum += d1 + d2;
				}
			}
			i++;
			num = num / 10;
		}
		return sum;
	}

	private static long sumOfOddPlace(long num) {
		long i = 1, sum = 0;
		while (num > 0) {
			if (i % 2 != 0)
				sum += num % 10;
			i++;
			num = num / 10;
		}

		return sum;
	}

}
