package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��10������1:13:06
 * @type ��ϰ��
 */
public class Demo8_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[][] a = new char[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				a[i][j] = ' ';
		printChess(a);
		while (!victor(a, 'X') && !victor(a, 'O') && !full(a)) {
			System.out.print("Xѡ������ �У�");
			int m = input.nextInt();
			System.out.print("Xѡ������ �У�");
			int n = input.nextInt();
			a[m][n] = 'X';
			printChess(a);
			System.out.print("Oѡ������ �У�");
			m = input.nextInt();
			System.out.print("Oѡ������ �У�");
			n = input.nextInt();
			a[m][n] = 'O';
			printChess(a);
		}
		if (victor(a, 'X'))
			System.out.println("\nXѡ��ʤ��");
		if (victor(a, 'O'))
			System.out.println("\nOѡ��ʤ��");
		if (full(a))
			System.out.println("\nƽ�֣�");

	}

	private static boolean victor(char[][] a, char c) {
		int flag1 = 0, flag2 = 0, flag3 = 0, flag4 = 0;
		for (int i = 0; i < 3; i++) { // �Խ���
			for (int j = 0; j < 3; j++) {
				if (i == j && a[i][j] == c)
					flag1++;
				if (i + j == 2 && a[i][j] == c)
					flag2++;
			}
		}
		for (int i = 0; i < 3; i++)
			if (a[i][0] == c && a[i][1] == c && a[i][2] == c)
				flag3 = 1;
		for (int j = 0; j < 3; j++)
			if (a[0][j] == c && a[1][j] == c && a[2][j] == c)
				flag4 = 1;
		if (flag1 == 3 || flag2 == 3 || flag3 == 1 || flag4 == 1)
			return true;
		return false;
	}

	private static boolean full(char[][] a) {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (a[i][j] == ' ')
					return false;
		return true;
	}

	private static void printChess(char[][] a) {
		int m = 0, n = 0;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++)
				if (i % 2 == 0)
					System.out.print("- -");
				else {
					if (j == 3)
						System.out.print("��");
					else {
						System.out.print("��" + a[m][n]);
						n++;
						if (n == 3) {
							m++;
							n = 0;
						}
					}
				}
			System.out.println();
		}
	}

}
