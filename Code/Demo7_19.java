package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��6������7:36:29
 * @type ��ϰ��
 */
public class Demo7_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������10�����֣�");
		double[] a = new double[10];
		for (int i = 0; i < 10; i++)
			a[i] = input.nextDouble();
		if (isSorted(a))
			System.out.println("������������");
		else
			System.out.println("������������");

	}

	private static boolean isSorted(double[] a) {
		int i, j;
		for (i = 0; i < 9; i++)
			for (j = i + 1; j < 10; j++)
				if (a[i] > a[j])
					return false;
		return true;
	}

}
