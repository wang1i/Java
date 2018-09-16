package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月6日下午8:05:29
 * @type 练习题
 */
public class Demo7_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入小球个数：");
		int balls = input.nextInt();
		System.out.print("请输入机器槽数：");
		int slots = input.nextInt();
		printImage(balls, slots);

	}

	private static void printImage(int balls, int slots) {
		String[] path = new String[7];
		int i, j, k, fi, fj;
		for (i = 0; i < balls; i++) {
			path[i] = "";
			for (j = 0; j < 7; j++) {
				if ((int) (Math.random() * 2) == 0)
					path[i] += 'L';
				else
					path[i] += 'R';
			}
			System.out.println(path[i]);
		}
		System.out.println("\n");

		char[][] a = new char[balls][slots];
		int[] flag = new int[slots];
		for (i = 0; i < balls; i++) {
			fi = balls - 1;
			for (k = 0; k < slots; k++)
				flag[k] = 0;
			for (j = 0; j < 7; j++) {
				if (path[i].charAt(j) == 'L') {
					for (k = 7; k >= 0 && flag[k] == 1; k--)
						;
					flag[k] = 1;
				} else {
					for (k = 0; k <= 7 && flag[k] == 1; k++)
						;
					flag[k] = 1;
				}
			}
			for (k = 0; k < 7 && flag[k] == 1; k++)
				;
			fj = k;
			while (a[fi][fj] == '0')
				fi--;
			a[fi][fj] = '0';
		}
		for (i = 0; i < balls; i++) {
			for (j = 0; j < slots; j++)
				if (a[i][j] == '0')
					System.out.print(a[i][j]);
				else
					System.out.print(" ");
			System.out.println();
		}
	}
}
