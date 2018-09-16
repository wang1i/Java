package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月4日下午6:08:55
 * @type 练习题
 */
public class Demo7_3 {

	public static void main(String[] args) {
		int i;
		int[] a = new int[10], b = new int[101];
		for (i = 0; i <= 100; i++)
			b[i] = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入10个1~100之间的整数：");
		for (i = 0; i < 10; i++) {
			a[i] = input.nextInt();
			b[a[i]]++;
		}
		for (i = 1; i <= 100; i++) {
			if (b[i] != 0)
				System.out.println(i + "出现" + b[i] + "次");
		}
	}

}
