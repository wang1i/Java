package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��10������3:49:52
 * @type ��ϰ��
 */
public class Demo8_11 {

	public static void main(String[] args) {
		char[][] a = new char[3][3];
		int[] num = new int[9];
		int i = 8, j = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("������0~511֮������֣�");
		int n = input.nextInt();
		while (n > 0) {
			num[i--] = n % 2;
			n = n / 2;
		}
		for (i = 0; i < 9; i++) {
			if (num[i] == 0)
				a[i / 3][j++] = 'H';
			else
				a[i / 3][j++] = 'T';
			if (j == 3)
				j = 0;
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++)
				System.out.print(a[i][j] + "  ");
			System.out.println();
		}

	}

}
