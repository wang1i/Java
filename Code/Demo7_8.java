package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��5������9:08:29
 * @type ��ϰ��
 */
public class Demo7_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������10������");
		double[] a = new double[10];
		for (int i = 0; i < 10; i++)
			a[i] = input.nextInt();
		System.out.println("ƽ��ֵΪ��" + average(a));
	}

	private static double average(double[] a) {
		double aver = 0;
		for (int i = 0; i < 10; i++)
			aver += a[i] / 10;
		return aver;
	}

}
