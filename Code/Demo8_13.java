package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��10������4:48:24
 * @type ��ϰ��
 */
public class Demo8_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������������������");
		int row = input.nextInt();
		int column = input.nextInt();
		double[][] a = new double[row][column];
		System.out.println("���������飺");
		for (int i = 0; i < row; i++)
			for (int j = 0; j < column; j++)
				a[i][j] = input.nextDouble();
		int[] point = locateLargest(a);
		System.out.println("�������" + point[0] + "��" + point[1] + "��");

	}

	private static int[] locateLargest(double[][] a) {
		int m = 0, n = 0;
		double max = -62767;
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
					m = i;
					n = j;
				}
			}
		int[] result = { m, n };
		return result;
	}

}
