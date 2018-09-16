package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��10������9:24:49
 * @type ��ϰ��
 */
public class Demo8_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������������޶�ֵ��");
		int n = input.nextInt();
		double limit = input.nextDouble();
		double[][] borrowers = new double[n][n + 1];
		System.out.println("���������м��������");
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n + 1; j++)
				borrowers[i][j] = input.nextDouble();
		int k = 0;
		int[] p = new int[n];
		System.out.print("����ȫ�������ǣ�");
		for (int i = 0; i < n; i++) {
			double asset = borrowers[i][0];
			for (int j = 1; j < n + 1; j++)
				asset += borrowers[i][j];
			if (asset < limit) {
				p[k++] = i;
				System.out.print(i + "  ");
				for (int j = 0; j < n; j++)
					borrowers[j][i + 1] = 0;
			}
		}
		for (int i = 0; i < n; i++) {
			double asset = borrowers[i][0];
			for (int j = 1; j < n + 1; j++)
				asset += borrowers[i][j];
			if (asset < limit) {
				for (int m = 0; m < k; m++)
					if (i != p[m])
						System.out.print(i + "  ");
			}
		}

	}
}