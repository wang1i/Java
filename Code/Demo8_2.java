package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月9日下午5:49:16
 * @type 练习题
 */
public class Demo8_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入4*4 的数组：");
		double[][] m = new double[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++)
				m[i][j] = input.nextDouble();
		}
		System.out.print("和为：" + sum(m));

	}

	private static double sum(double[][] m) {
		double sum = 0;
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++)
				if (i == j)
					sum += m[i][j];
		return sum;
	}

}
