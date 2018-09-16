package myjava;

import java.util.Scanner;

public class Demo12_3 {

	public static void main(String[] args) {
		int[] a = new int[100];
		try {
			for (int i = 0; i < 100; i++) {
				a[i] = (int) (Math.random() * 10000);
			}
			System.out.print("输入数组下标：");
			int index;
			try (Scanner input = new Scanner(System.in);) {
				index = input.nextInt();
			}
			System.out.println(a[index]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("数组越界！");
		}

	}

}
