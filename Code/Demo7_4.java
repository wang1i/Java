package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月4日下午11:10:47
 * @type 练习题
 */
public class Demo7_4 {

	public static void main(String[] args) {
		double[] a = new double[100];
		int i = 0, n = -1, up = 0, down = 0;
		double aver = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入若干分数，以任一负数结束：");
		do {
			n++;
			a[n] = input.nextInt();
		} while (a[n] > 0);
		for (i = 0; i < n; i++)
			aver += a[i] / n;
		for (i = 0; i < n; i++) {
			if (a[i] >= aver)
				up++;
			else
				down++;
		}
		System.out.println(up + "个成绩高于平均分" + aver + "\n" + down + "个分数低于平均值" + aver);

	}

}
