package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��14������9:08:46
 * @type ��ϰ��
 */
public class Demo8_35 {

	public static void main(String[] args) {
		int[][] a = getArray();
		searchMaxSon(a, a.length);

	}

	private static int[][] getArray() {
		Scanner input = new Scanner(System.in);
		System.out.print("��������������");
		int n = input.nextInt();
		System.out.println("���������");
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = input.nextInt();
		return a;
	}

	private static void searchMaxSon(int[][] a, int len) {
		int m = 0, n = 0, p = 0, d = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				d = maxDegree(a, i, j);
				if (d > p) {
					p = d;
					m = i;
					n = j;
				}
			}
		}
		System.out.println("����Ӿ�����Ԫ���ǣ���" + m + "," + n + ")    " + "�������" + p);
	}

	private static int maxDegree(int[][] a, int i, int j) {
		int m, n, d = 0;
		if (i >= j) {
			d = 0;
			for (m = i; m < a.length; m++)
				if (isFull1(a, i, j, m))
					d++;
		}
		if (i < j) {
			d = 0;
			for (n = j; n < a.length; n++)
				if (isFull1(a, i, j, n))
					d++;
		}
		return d;
	}

	private static boolean isFull1(int[][] a, int i, int j, int x) {
		if (i >= j) {
			for (int m = i; m <= x; m++)
				for (int n = j; n <= j + x - i; n++)
					if (a[m][n] != 1)
						return false;
		}
		if (i < j) {
			for (int n = j; n <= x; n++)
				for (int m = i; m <= i + x - j; m++)
					if (a[m][n] != 1)
						return false;
		}
		return true;
	}

}
