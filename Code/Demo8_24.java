package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��13������1:35:31
 * @type ��ϰ��
 */
public class Demo8_24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������������");
		int[][] a = new int[9][9];
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				a[i][j] = input.nextInt();
		if (isSudoku(a))
			System.out.println("��Ϊ����");
		else
			System.out.println("��������");

	}

	private static boolean isSudoku(int[][] a) {
		int[] flag = new int[10];
		for (int i = 0; i < 9; i++) {
			initial(flag);
			for (int j = 0; j < 9; j++)
				if (flag[a[i][j]] == 0)
					flag[a[i][j]]++;
				else
					return false;
		}
		for (int i = 0; i < 9; i++) {
			initial(flag);
			for (int j = 0; j < 9; j++)
				if (flag[a[j][i]] == 0)
					flag[a[j][i]]++;
				else
					return false;
		}
		for (int i = 0; i < 9; i += 3) {
			int m = i;
			for (int j = 0; j < 9; j += 3) {
				int n = j;
				while (m < i + 3) {
					initial(flag);
					while (n < j + 3) {
						if (flag[a[m][n]] == 0)
							flag[a[m][n]]++;
						else
							return false;
						n++;
					}
					m++;
				}
			}
		}

		return true;
	}

	private static void initial(int[] flag) {
		for (int i = 0; i < 10; i++)
			flag[i] = 0;
	}

}
