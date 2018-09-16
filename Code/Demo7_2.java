package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月4日下午5:52:20
 * @type 练习题
 */
public class Demo7_2 {

	public static void main(String[] args) {
		int i;
		int[] a = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.print("请输入10个整数：");
		for (i = 0; i < 10; i++)
			a[i] = input.nextInt();
		for (i = 9; i >= 0; i--)
			System.out.print(a[i] + " ");

	}

}
