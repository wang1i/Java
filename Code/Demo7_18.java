package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��6������7:22:02
 * @type ��ϰ��
 */
public class Demo7_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������10�����֣�");
		double[] a = new double[10];
		int i, j;
		for (i = 0; i < 10; i++)
			a[i] = input.nextDouble();
		for (i = 0; i < 9; i++) {
			for (j = 9; j > i; j--)
				if (a[j] < a[j - 1]) {
					double temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
		}
		for (i = 0; i < 10; i++)
			System.out.print(a[i] + "  ");

	}

}
