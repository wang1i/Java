package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年6月14日下午10:02:51
 * @type 练习题
 */
public class Demo10_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入正整数：");
		int value = input.nextInt();
		StackOfInteger f = new StackOfInteger(value);
		int n = f.getTop();
		int[] a = f.getFactor();
		for (int i = n - 1; i > 0; i--)
			System.out.print(a[i] + "、");
		System.out.println(a[0]);
	}

}
