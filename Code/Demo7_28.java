package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��7������10:26:26
 * @type ��ϰ��
 */
public class Demo7_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������10��������");
		int[] num = new int[10];
		for (int i = 0; i < 10; i++)
			num[i] = input.nextInt();
		printTwo(num, 10);

	}

	private static void printTwo(int[] num, int n) {
		int[] flag = new int[n];
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			flag[i] = 1;
			for (int j = i + 1; j < n; j++) {
				if (num[i] != num[j] && flag[j] == 0) {
					System.out.print(num[i] + "," + num[j] + " \t");
					count++;
					if (count % 5 == 0)
						System.out.println();
				}
			}

		}

	}

}
