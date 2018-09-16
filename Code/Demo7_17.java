package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月6日下午5:04:07
 * @type 练习题
 */
public class Demo7_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入学生人数：");
		int n = input.nextInt();
		String[] name = new String[n];
		double[] score = new double[n];
		String temp;
		for (int i = 0; i < n; i++) {
			temp = input.nextLine();
			System.out.print("学生" + (i + 1) + ": 姓名 ");
			name[i] = input.nextLine();
			System.out.print("  成绩 ");
			score[i] = input.nextDouble();
		}
		printNameOfDiscending(name, score, n);

	}

	private static void printNameOfDiscending(String[] name, double[] score, int n) {
		int count = n, i, maxi;
		double max;
		while (count > 0) {
			max = -1;
			maxi = -1;
			for (i = 0; i < n; i++)
				if (score[i] > max) {
					max = score[i];
					maxi = i;
				}
			score[maxi] = -2;
			System.out.print(name[maxi] + "     ");
			count--;
		}
	}

}
