package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年6月8日下午8:42:28
 * @type 练习题
 */
public class Demo9_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入a,b,c的值：");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		QuadraticEquation equa = new QuadraticEquation(a, b, c);
		if (equa.getDiscriminant() < 0)
			System.out.println("方程无根");
		else if (equa.getDiscriminant() == 0)
			System.out.println("方程有单根：" + equa.getRoot1());
		else
			System.out.println("方程有两个根，分别是：" + equa.getRoot1() + " 和 " + equa.getRoot2());

	}

}
