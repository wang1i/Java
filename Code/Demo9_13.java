package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��8������11:02:02
 * @type ��ϰ��
 */
public class Demo9_13 {

	public static void main(String[] args) {
		double[][] a = getArray();
		Location local = locateLargest(a);
		System.out.println("�������ֵΪ��" + local.maxValue + "\t  λ�ڵ�" + local.row + " �� " + " �� " + local.column + "��");

	}

	private static Location locateLargest(double[][] a) {
		Location local = new Location();
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > Location.maxValue) {
					Location.maxValue = a[i][j];
					Location.row = i;
					Location.column = j;
				}
			}
		return local;
	}

	private static double[][] getArray() {
		Scanner input = new Scanner(System.in);
		System.out.print("���������������������");
		int m = input.nextInt();
		int n = input.nextInt();
		double[][] a = new double[m][n];
		System.out.println("���������");
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = input.nextDouble();
		return a;
	}

}
