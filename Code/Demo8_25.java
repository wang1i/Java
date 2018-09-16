package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月13日下午6:51:45
 * @type 练习题
 */
public class Demo8_25 {

	public static void main(String[] args) {
		double[][] a = getArray();
		System.out.println(isMarkovMatrix(a) ? "此是马尔科夫矩阵" : "不是马尔科夫矩阵");
	}

	private static boolean isMarkovMatrix(double[][] a) {
		for (int i = 0; i < 3; i++) {
			double sum = 0;
			for (int j = 0; j < 3; j++) {
				if (a[j][i] <= 0)
					return false;
				sum += a[j][i];
			}
			if (sum != 1)
				return false;
		}
		return true;
	}

	private static double[][] getArray() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入3*3矩阵：");
		double[][] a = new double[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				a[i][j] = input.nextDouble();
		return a;
	}

}
