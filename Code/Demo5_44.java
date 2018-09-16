package myjava;

import java.util.Scanner;

public class Demo5_44 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		short value = input.nextShort();
		int temp, bit, mask = 1;
		for (int i = 15; i >= 0; i--) {
			temp = value >> i;
			bit = mask & temp;
			System.out.print(bit);

		}

	}

}
