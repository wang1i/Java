package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月7日下午9:22:23
 * @type 练习题
 */
public class Demo7_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个数列数的个数：");
		int len1 = input.nextInt();
		System.out.print("请输入第一个数列：");
		int[] list1 = new int[len1];
		for (int i = 0; i < len1; i++)
			list1[i] = input.nextInt();
		System.out.print("\n请输入第二个数列数的个数：");
		int len2 = input.nextInt();
		System.out.print("请输入第二个数列：");
		int[] list2 = new int[len2];
		for (int i = 0; i < len2; i++)
			list2[i] = input.nextInt();
		if (equals(list1, list2))
			System.out.println("数列1与数列2相同");
		else
			System.out.println("数列1与数列2不同");

	}

	private static boolean equals(int[] list1, int[] list2) {
		if (list1.length != list2.length)
			return false;
		int i, j;
		int[] flag = new int[list1.length];
		for (j = 0; j < list1.length; j++)
			for (i = 0; i < list1.length; i++) {
				if (list2[j] == list1[i] && flag[i] == 0)
					flag[i] = 1;
				else
					break;
			}
		if (j >= list1.length)
			return true;
		else
			return false;

	}

}
