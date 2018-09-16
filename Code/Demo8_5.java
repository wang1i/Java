package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月9日下午7:32:03
 * @type 练习题
 */
public class Demo8_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入3 * 3的矩阵a：");
		double[][] a = new double[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				a[i][j] = input.nextDouble();
		System.out.println("请输入3 * 3的矩阵b：");
		double[][] b = new double[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				b[i][j] = input.nextDouble();
		double[][] c = addMatrix(a, b);
		int i;
		for (i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(a[i][j] + "  ");
			if (i == 1)
				System.out.print(" + ");
			else
				System.out.print("     ");
			for (int j = 0; j < 3; j++)
				System.out.print(b[i][j] + "  ");
			if (i == 1)
				System.out.print(" + ");
			else
				System.out.print("     ");
			for (int j = 0; j < 3; j++)
				System.out.print(c[i][j] + "  ");
			System.out.println();
		}
	}

	private static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] c = new double[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				c[i][j] = a[i][j] + b[i][j];
		return c;
	}

}
