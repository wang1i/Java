package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月6日下午7:22:02
 * @type 练习题
 */
public class Demo7_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入10个数字：");
		double[] a = new double[10];
		int i, j;
		for (i = 0; i < 10; i++)
			a[i] = input.nextDouble();
		for (i = 0; i < 9; i++) {
			for (j = 9; j > i; j--)
				if (a[j] < a[j - 1]) {
					double temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
		}
		for (i = 0; i < 10; i++)
			System.out.print(a[i] + "  ");

	}

}
