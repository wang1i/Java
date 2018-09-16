package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年4月25日下午9:57:26
 * @type 练习题
 */
public class Demo6_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入整数、宽度：");
		int num = input.nextInt();
		int width = input.nextInt();
		System.out.println(format(num, width));

	}

	private static String format(int num, int width) {
		int i = 0;
		String s = num + "";
		while (num > 0) {
			num = num / 10;
			i++;
		}
		while (i < width) {
			s = '0' + s;
			i++;
		}
		return s;
	}

}
