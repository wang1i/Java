package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��9������5:49:16
 * @type ��ϰ��
 */
public class Demo8_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������4*4 �����飺");
		double[][] m = new double[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++)
				m[i][j] = input.nextDouble();
		}
		System.out.print("��Ϊ��" + sum(m));

	}

	private static double sum(double[][] m) {
		double sum = 0;
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++)
				if (i == j)
					sum += m[i][j];
		return sum;
	}

}
