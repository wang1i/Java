package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��5������9:48:15
 * @type ��ϰ��
 */
public class Demo7_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������10�����֣�");
		double[] a = new double[10];
		for (int i = 0; i < 10; i++) {
			a[i] = input.nextDouble();
		}
		System.out.println("��Сֵ�±�Ϊ��" + IndexOfSmallest(a));

	}

	private static int IndexOfSmallest(double[] a) {
		int mini = 0;
		double min = a[0];
		for (int i = 1; i < 10; i++) {
			if (a[i] < min) {
				min = a[i];
				mini = i;
			}

		}
		return mini;
	}

}
