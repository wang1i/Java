package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月14日下午9:08:46
 * @type 练习题
 */
public class Demo8_35 {

	public static void main(String[] args) {
		int[][] a = getArray();
		searchMaxSon(a, a.length);

	}

	private static int[][] getArray() {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入矩阵阶数：");
		int n = input.nextInt();
		System.out.println("请输入矩阵：");
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = input.nextInt();
		return a;
	}

	private static void searchMaxSon(int[][] a, int len) {
		int m = 0, n = 0, p = 0, d = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				d = maxDegree(a, i, j);
				if (d > p) {
					p = d;
					m = i;
					n = j;
				}
			}
		}
		System.out.println("最大子矩阵首元素是：（" + m + "," + n + ")    " + "其阶数是" + p);
	}

	private static int maxDegree(int[][] a, int i, int j) {
		int m, n, d = 0;
		if (i >= j) {
			d = 0;
			for (m = i; m < a.length; m++)
				if (isFull1(a, i, j, m))
					d++;
		}
		if (i < j) {
			d = 0;
			for (n = j; n < a.length; n++)
				if (isFull1(a, i, j, n))
					d++;
		}
		return d;
	}

	private static boolean isFull1(int[][] a, int i, int j, int x) {
		if (i >= j) {
			for (int m = i; m <= x; m++)
				for (int n = j; n <= j + x - i; n++)
					if (a[m][n] != 1)
						return false;
		}
		if (i < j) {
			for (int n = j; n <= x; n++)
				for (int m = i; m <= i + x - j; m++)
					if (a[m][n] != 1)
						return false;
		}
		return true;
	}

}
