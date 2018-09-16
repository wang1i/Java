package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��4��24������6:03:13
 * @type ��ϰ��
 */
public class Demo6_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("����һ����������ƽ������");
		long n = input.nextLong();
		System.out.println("��ƽ����Ϊ��" + sqrt(n));

	}

	private static double sqrt(long n) {
		double lastGuess, nextGuess = 1;
		do {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		} while (Math.abs(nextGuess - lastGuess) > 0.001);
		return nextGuess;
	}

}
