package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月7日下午11:30:21
 * @type 练习题
 */
public class Demo7_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入数列长度：");
		int n = input.nextInt();
		System.out.print("请输入数列：");
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = input.nextInt();
		if (isConsecutiveFour(a))
			System.out.println("数列有连续四个相等的值");
		else
			System.out.println("数列没有连续四个相等的值");

	}

	private static boolean isConsecutiveFour(int[] a) {
		int key = a[0], count = 0;
		for (int i = 0; i < a.length; i++) {
			if (count == 4)
				return true;
			if (a[i] == key)
				count++;
			else {
				key = a[i];
				count = 1;
			}
		}
		return false;
	}

}
