package myjava;

import java.util.Scanner;

public class Demo5_38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个十进制数：");
		int num = input.nextInt();
		int[] array = new int[20];
		int i = 0, j;
		if (num == 0) {
			System.out.println("对应的八进制数为：" + num);
			System.exit(1);
		}
		while (num > 0) {
			array[i++] = num % 8;
			num = num / 8;
		}
		System.out.print("对应的八进制数为：");
		for (j = i - 1; j >= 0; j--)
			System.out.print(array[j]);

	}

}
