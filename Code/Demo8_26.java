package myjava;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月13日下午7:12:30
 * @type 练习题
 */
public class Demo8_26 {

	public static void main(String[] args) {
		double[][] a = getArray();
		for (int i = 0; i < 3; i++)
			Arrays.sort(a[i]);
		System.out.println("行排序矩阵是：");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(a[i][j] + "  ");
			System.out.println();
		}
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
