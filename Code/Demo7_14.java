package myjava;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月6日下午4:16:34
 * @type 练习题
 */
public class Demo7_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入五个正整数：");
		int[] a = new int[5];
		for (int i = 0; i < 5; i++)
			a[i] = input.nextInt();
		System.out.println("最大公约数为：" + gcd(a));

	}

	private static int gcd(int[] a) {
		Arrays.sort(a);
		int gcd = 1, i, j;
		for (i = 1; i <= a[0]; i++) {
			for (j = 0; j < 5; j++)
				if (a[j] % i != 0)
					break;
			if (j >= 5)
				gcd = i;
		}
		return gcd;
	}

}
