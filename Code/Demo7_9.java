package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��5������9:26:45
 * @type ��ϰ��
 */
public class Demo7_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������10������");
		double[] a = new double[10];
		for (int i = 0; i < 10; i++)
			a[i] = input.nextDouble();
		System.out.print("��СֵΪ��" + min(a));

	}

	private static double min(double[] a) {
		double min = a[0];
		for (int i = 1; i < 10; i++)
			if (a[i] < min)
				min = a[i];
		return min;
	}

}
