package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月11日上午11:17:31
 * @type 练习题
 */
public class Demo8_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入二维数组：");
		int[][] a = new int[5][2];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++)
				a[i][j] = input.nextInt();
		}
		shuffle(a);

	}

	private static void shuffle(int[][] a) {
		int[] t = new int[2];
		int rand;
		for (int i = 0; i < 5; i++) {
			rand = (int) (Math.random() * 5);
			t = a[i];
			a[i] = a[rand];
			a[rand] = t;
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++)
				System.out.print(a[i][j] + "  ");
			System.out.println();
		}
	}

}
