package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月13日下午7:21:12
 * @type 练习题
 */
public class Demo8_28 {

	public static void main(String[] args) {
		int[][] m1 = getArray();
		int[][] m2 = getArray();
		System.out.println(equals(m1, m2) ? "m1与m2是相同数组" : "m1与m2不是相同数组");

	}

	private static boolean equals(int[][] m1, int[][] m2) {
		int[] flag = new int[9];
		int i = 0, j = 0;
		while (i < 3) {
			for (int m = 0; m < 3; m++)
				for (int n = 0; n < 3; n++)
					if (m1[i][j] == m2[m][n] && flag[3 * m + n] == 0)
						flag[3 * m + n]++;
			j++;
			if (j == 3) {
				i++;
				j = 0;
			}
		}
		for (i = 0; i < 9; i++)
			if (flag[i] == 0)
				return false;
		return true;
	}

	private static int[][] getArray() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入3*3矩阵：");
		int[][] a = new int[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				a[i][j] = input.nextInt();
		return a;
	}

}
