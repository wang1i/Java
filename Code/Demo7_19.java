package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月6日下午7:36:29
 * @type 练习题
 */
public class Demo7_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入10个数字：");
		double[] a = new double[10];
		for (int i = 0; i < 10; i++)
			a[i] = input.nextDouble();
		if (isSorted(a))
			System.out.println("数列排列有序");
		else
			System.out.println("数列排列无序");

	}

	private static boolean isSorted(double[] a) {
		int i, j;
		for (i = 0; i < 9; i++)
			for (j = i + 1; j < 10; j++)
				if (a[i] > a[j])
					return false;
		return true;
	}

}
