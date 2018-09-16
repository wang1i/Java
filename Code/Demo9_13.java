package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年6月8日下午11:02:02
 * @type 练习题
 */
public class Demo9_13 {

	public static void main(String[] args) {
		double[][] a = getArray();
		Location local = locateLargest(a);
		System.out.println("矩阵最大值为：" + local.maxValue + "\t  位于第" + local.row + " 行 " + " 第 " + local.column + "列");

	}

	private static Location locateLargest(double[][] a) {
		Location local = new Location();
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > Location.maxValue) {
					Location.maxValue = a[i][j];
					Location.row = i;
					Location.column = j;
				}
			}
		return local;
	}

	private static double[][] getArray() {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入矩阵行数和列数：");
		int m = input.nextInt();
		int n = input.nextInt();
		double[][] a = new double[m][n];
		System.out.println("请输入矩阵：");
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = input.nextDouble();
		return a;
	}

}
