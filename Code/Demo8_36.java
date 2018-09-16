package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��14������10:25:18
 * @type ��ϰ��
 */
public class Demo8_36 {

	public static void main(String[] args) {
		char[][] a = getArray();
		System.out.println(isLatinMatrix(a) ? "��Ϊ����������" : "��������������");
	}

	private static char[][] getArray() {
		Scanner input = new Scanner(System.in);
		System.out.print("��������������");
		int n = input.nextInt();
		String t = input.nextLine();
		System.out.println("���������");
		char[][] c = new char[n][n];
		String s = input.nextLine();
		int basic = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = s.charAt(basic);
				basic += 1;
				System.out.print(c[i][j] + "  ");
			}
			System.out.println();
		}
		return c;
	}

	private static boolean isLatinMatrix(char[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++)
				if (!isValid(a, i, j))
					return false;
		}
		return true;
	}

	private static boolean isValid(char[][] a, int i, int j) {
		for (int n = 0; n < a.length; n++)
			if (n != j && a[i][n] == a[i][j])
				return false;
		for (int m = 0; m < a.length; m++)
			if (m != i && a[m][j] == a[i][j])
				return false;
		return true;
	}

}
