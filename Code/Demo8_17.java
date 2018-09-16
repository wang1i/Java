package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月10日下午9:24:49
 * @type 练习题
 */
public class Demo8_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入银行数、限定值：");
		int n = input.nextInt();
		double limit = input.nextDouble();
		double[][] borrowers = new double[n][n + 1];
		System.out.println("请输入银行间借款情况：");
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n + 1; j++)
				borrowers[i][j] = input.nextDouble();
		int k = 0;
		int[] p = new int[n];
		System.out.print("不安全的银行是：");
		for (int i = 0; i < n; i++) {
			double asset = borrowers[i][0];
			for (int j = 1; j < n + 1; j++)
				asset += borrowers[i][j];
			if (asset < limit) {
				p[k++] = i;
				System.out.print(i + "  ");
				for (int j = 0; j < n; j++)
					borrowers[j][i + 1] = 0;
			}
		}
		for (int i = 0; i < n; i++) {
			double asset = borrowers[i][0];
			for (int j = 1; j < n + 1; j++)
				asset += borrowers[i][j];
			if (asset < limit) {
				for (int m = 0; m < k; m++)
					if (i != p[m])
						System.out.print(i + "  ");
			}
		}

	}
}