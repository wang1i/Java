package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月10日下午3:49:52
 * @type 练习题
 */
public class Demo8_11 {

	public static void main(String[] args) {
		char[][] a = new char[3][3];
		int[] num = new int[9];
		int i = 8, j = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入0~511之间的数字：");
		int n = input.nextInt();
		while (n > 0) {
			num[i--] = n % 2;
			n = n / 2;
		}
		for (i = 0; i < 9; i++) {
			if (num[i] == 0)
				a[i / 3][j++] = 'H';
			else
				a[i / 3][j++] = 'T';
			if (j == 3)
				j = 0;
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++)
				System.out.print(a[i][j] + "  ");
			System.out.println();
		}

	}

}
