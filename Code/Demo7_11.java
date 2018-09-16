package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��6������10:56:28
 * @type ��ϰ��
 */
public class Demo7_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������10�����֣�");
		double[] a = new double[10];
		for (int i = 0; i < 10; i++)
			a[i] = input.nextDouble();
		System.out.println("ƽ��ֵ��" + mean(a));
		System.out.println("���" + deviation(a));

	}

	private static double deviation(double[] a) {
		double d = 0;
		for (int i = 0; i < 10; i++) {
			d += Math.pow(a[i] - mean(a), 2);
		}
		return Math.sqrt(d / 9);
	}

	private static double mean(double[] a) {
		double aver = 0;
		for (int i = 0; i < 10; i++)
			aver += a[i] / 10;
		return aver;
	}

}
