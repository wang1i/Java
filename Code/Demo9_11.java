package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年6月8日下午9:38:55
 * @type 练习题
 */
public class Demo9_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入a,b,c,d,e,f：");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		LinearEquation equa = new LinearEquation(a, b, c, d, e, f);
		if (!equa.isSolvable()) {
			System.out.println("方程无解");
			System.exit(0);
		}
		System.out.println("x = " + equa.getX() + "\ny = " + equa.getY());

	}

}
