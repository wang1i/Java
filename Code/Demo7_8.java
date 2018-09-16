package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月5日下午9:08:29
 * @type 练习题
 */
public class Demo7_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入10个数：");
		double[] a = new double[10];
		for (int i = 0; i < 10; i++)
			a[i] = input.nextInt();
		System.out.println("平均值为：" + average(a));
	}

	private static double average(double[] a) {
		double aver = 0;
		for (int i = 0; i < 10; i++)
			aver += a[i] / 10;
		return aver;
	}

}
