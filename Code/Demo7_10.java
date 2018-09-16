package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月5日下午9:48:15
 * @type 练习题
 */
public class Demo7_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入10个数字：");
		double[] a = new double[10];
		for (int i = 0; i < 10; i++) {
			a[i] = input.nextDouble();
		}
		System.out.println("最小值下标为：" + IndexOfSmallest(a));

	}

	private static int IndexOfSmallest(double[] a) {
		int mini = 0;
		double min = a[0];
		for (int i = 1; i < 10; i++) {
			if (a[i] < min) {
				min = a[i];
				mini = i;
			}

		}
		return mini;
	}

}
