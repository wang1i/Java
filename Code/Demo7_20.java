package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��6������7:54:51
 * @type ��ϰ��
 */
public class Demo7_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������10�����֣�");
		double[] a = new double[10];
		int i, j;
		for (i = 0; i < 10; i++)
			a[i] = input.nextDouble();
		SelectSort(a);

	}

	private static void SelectSort(double[] a) {
		int i, j, k;
		double temp;
		for (i = 9; i > 0; i--) {
			k = i;
			for (j = i - 1; j >= 0; j--)
				if (a[j] > a[k])
					k = j;
			if (k != i) {
				temp = a[k];
				a[k] = a[i];
				a[i] = temp;
			}
		}
		for (i = 0; i < 10; i++)
			System.out.print(a[i] + "  ");

	}

}
