package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月10日下午8:49:43
 * @type 练习题
 */
public class Demo8_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入二维数组：");
		double[][] a = new double[6][2];
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 2; j++)
				a[i][j] = input.nextDouble();
		sort(a);

	}

	private static void sort(double[][] a) {
		double[] temp = new double[2];
		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 5 - i; j++)
				if (a[j][1] > a[j + 1][1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 5 - i; j++)
				if (a[j][0] > a[j + 1][0]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 2; j++)
				System.out.print(a[i][j] + "  ");

	}

}
