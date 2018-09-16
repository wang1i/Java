package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月14日下午10:25:18
 * @type 练习题
 */
public class Demo8_36 {

	public static void main(String[] args) {
		char[][] a = getArray();
		System.out.println(isLatinMatrix(a) ? "此为拉丁正方形" : "不是拉丁正方形");
	}

	private static char[][] getArray() {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入矩阵阶数：");
		int n = input.nextInt();
		String t = input.nextLine();
		System.out.println("请输入矩阵：");
		char[][] c = new char[n][n];
		String s = input.nextLine();
		int basic = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = s.charAt(basic);
				basic += 1;
				System.out.print(c[i][j] + "  ");
			}
			System.out.println();
		}
		return c;
	}

	private static boolean isLatinMatrix(char[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++)
				if (!isValid(a, i, j))
					return false;
		}
		return true;
	}

	private static boolean isValid(char[][] a, int i, int j) {
		for (int n = 0; n < a.length; n++)
			if (n != j && a[i][n] == a[i][j])
				return false;
		for (int m = 0; m < a.length; m++)
			if (m != i && a[m][j] == a[i][j])
				return false;
		return true;
	}

}
