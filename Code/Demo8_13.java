package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月10日下午4:48:24
 * @type 练习题
 */
public class Demo8_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入行数及列数：");
		int row = input.nextInt();
		int column = input.nextInt();
		double[][] a = new double[row][column];
		System.out.println("请输入数组：");
		for (int i = 0; i < row; i++)
			for (int j = 0; j < column; j++)
				a[i][j] = input.nextDouble();
		int[] point = locateLargest(a);
		System.out.println("最大数在" + point[0] + "行" + point[1] + "列");

	}

	private static int[] locateLargest(double[][] a) {
		int m = 0, n = 0;
		double max = -62767;
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
					m = i;
					n = j;
				}
			}
		int[] result = { m, n };
		return result;
	}

}
