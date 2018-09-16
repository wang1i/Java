package myjava;

import java.util.Scanner;

public class Demo5_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个正整数（十进制）：");
		int num = input.nextInt();
		int i = 0;
		int[] array = new int[20];
		while (num > 0) {
			array[i++] = num % 2;
			num = num / 2;
		}
		System.out.print("对应 的二进制数为：");
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(array[j]);
		}
	}

}
