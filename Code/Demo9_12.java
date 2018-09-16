package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年6月8日下午10:26:05
 * @type 练习题
 */
public class Demo9_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入线段1的两个端点坐标：");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		System.out.print("请输入线段2的两个端点坐标：");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		double a = y1 - y2;
		double b = x2 - x1;
		double c = y3 - y4;
		double d = x4 - x3;
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;

		LinearEquation equa = new LinearEquation(a, b, c, d, e, f);
		if (!equa.isSolvable()) {
			System.out.println("方程无解");
			System.exit(0);
		}
		System.out.println("x = " + equa.getX() + "\ny = " + equa.getY());

	}

}
