package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��4������11:10:47
 * @type ��ϰ��
 */
public class Demo7_4 {

	public static void main(String[] args) {
		double[] a = new double[100];
		int i = 0, n = -1, up = 0, down = 0;
		double aver = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("���������ɷ���������һ����������");
		do {
			n++;
			a[n] = input.nextInt();
		} while (a[n] > 0);
		for (i = 0; i < n; i++)
			aver += a[i] / n;
		for (i = 0; i < n; i++) {
			if (a[i] >= aver)
				up++;
			else
				down++;
		}
		System.out.println(up + "���ɼ�����ƽ����" + aver + "\n" + down + "����������ƽ��ֵ" + aver);

	}

}
