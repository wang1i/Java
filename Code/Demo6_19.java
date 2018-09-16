package myjava;

import java.util.Scanner;

public class Demo6_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入三角形三边：");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		if (!isValid(a, b, c))
			System.out.println("输入无效");
		else
			System.out.println("三角形面积为：" + area(a, b, c));

	}

	private static boolean isValid(double a, double b, double c) {
		if (a + b <= c || a + c <= b || b + c <= a)
			return false;
		else
			return true;
	}

	private static double area(double a, double b, double c) {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
