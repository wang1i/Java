package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��5������10:56:44
 * @type ��ϰ��
 */
public class Demo7_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������������֣�");
		double[] a = new double[20];
		int i, n = 0, count = 0;
		do {
			a[n] = input.nextDouble();
			if (n == 0) {
				count++;
				System.out.print(a[n] + " ");
			}
			for (i = 0; i < n; i++)
				if (a[n] == a[i])
					break;
			if (i >= n && n != 0) {
				count++;
				System.out.print(a[n] + " ");
			}
			n++;
		} while (n < 10);
		System.out.println("\n���ظ������ֳ���" + count + "��");

	}

}
