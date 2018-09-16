package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��10������6:10:18
 * @type ��ϰ��
 */
public class Demo8_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("��������������");
		int n = input.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = (int) (Math.random() * 2);
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		int Rflag1, Rflag0, Cflag1, Cflag0, Dflag1 = 0, Dflag0 = 0, Sflag1 = 0, Sflag0 = 0;
		for (int i = 0; i < n; i++) { // ��
			Rflag1 = 0;
			Rflag0 = 0;
			Cflag1 = 0;
			Cflag0 = 0;
			for (int j = 0; j < n; j++) {
				if (a[i][j] == 1)
					Rflag1++;
				if (a[i][j] == 0)
					Rflag0++;
				if (a[j][i] == 1)
					Cflag1++;
				if (a[j][i] == 0)
					Cflag0++;
				if (i == j && a[i][j] == 1)
					Dflag1++;
				if (i == j && a[i][j] == 0)
					Dflag0++;
				if (i + j == n - 1 && a[i][j] == 1)
					Sflag1++;
				if (i + j == n - 1 && a[i][j] == 0)
					Sflag0++;
			}
			if (Rflag1 == n)
				System.out.println(i + "��ȫ��1");
			if (Rflag0 == n)
				System.out.println(i + "��ȫ��0");
			if (Cflag1 == n)
				System.out.println(i + "��ȫ��1");
			if (Cflag0 == n)
				System.out.println(i + "��ȫ��0");
			if (Dflag1 == n)
				System.out.println("���Խ���ȫ��1");
			if (Dflag0 == n)
				System.out.println("���Խ���ȫ��0");
			if (Sflag1 == n)
				System.out.println("���Խ���ȫ��1");
			if (Sflag0 == n)
				System.out.println("���Խ���ȫ��0");
		}

	}

}
