package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��13������6:51:45
 * @type ��ϰ��
 */
public class Demo8_25 {

	public static void main(String[] args) {
		double[][] a = getArray();
		System.out.println(isMarkovMatrix(a) ? "��������Ʒ����" : "��������Ʒ����");
	}

	private static boolean isMarkovMatrix(double[][] a) {
		for (int i = 0; i < 3; i++) {
			double sum = 0;
			for (int j = 0; j < 3; j++) {
				if (a[j][i] <= 0)
					return false;
				sum += a[j][i];
			}
			if (sum != 1)
				return false;
		}
		return true;
	}

	private static double[][] getArray() {
		Scanner input = new Scanner(System.in);
		System.out.println("������3*3����");
		double[][] a = new double[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				a[i][j] = input.nextDouble();
		return a;
	}

}
