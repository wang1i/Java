package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月10日下午6:10:18
 * @type 练习题
 */
public class Demo8_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入矩阵阶数：");
		int n = input.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = (int) (Math.random() * 2);
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		int Rflag1, Rflag0, Cflag1, Cflag0, Dflag1 = 0, Dflag0 = 0, Sflag1 = 0, Sflag0 = 0;
		for (int i = 0; i < n; i++) { // 行
			Rflag1 = 0;
			Rflag0 = 0;
			Cflag1 = 0;
			Cflag0 = 0;
			for (int j = 0; j < n; j++) {
				if (a[i][j] == 1)
					Rflag1++;
				if (a[i][j] == 0)
					Rflag0++;
				if (a[j][i] == 1)
					Cflag1++;
				if (a[j][i] == 0)
					Cflag0++;
				if (i == j && a[i][j] == 1)
					Dflag1++;
				if (i == j && a[i][j] == 0)
					Dflag0++;
				if (i + j == n - 1 && a[i][j] == 1)
					Sflag1++;
				if (i + j == n - 1 && a[i][j] == 0)
					Sflag0++;
			}
			if (Rflag1 == n)
				System.out.println(i + "行全是1");
			if (Rflag0 == n)
				System.out.println(i + "行全是0");
			if (Cflag1 == n)
				System.out.println(i + "列全是1");
			if (Cflag0 == n)
				System.out.println(i + "列全是0");
			if (Dflag1 == n)
				System.out.println("正对角线全是1");
			if (Dflag0 == n)
				System.out.println("正对角线全是0");
			if (Sflag1 == n)
				System.out.println("反对角线全是1");
			if (Sflag0 == n)
				System.out.println("反对角线全是0");
		}

	}

}
