package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年4月24日下午6:03:13
 * @type 练习题
 */
public class Demo6_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("输入一个整数求其平方根：");
		long n = input.nextLong();
		System.out.println("其平方根为：" + sqrt(n));

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
