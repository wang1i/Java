package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��4��26������7:33:42
 * @type ��ϰ��
 */
public class Demo7_1 {

	public static void main(String[] args) {
		int i;
		double best = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("������ѧ��������");
		int n = input.nextInt();
		double[] arr = new double[n];
		System.out.print("����������ѧ���ɼ���");
		for (i = 0; i < n; i++) {
			arr[i] = input.nextInt();
			if (arr[i] > best)
				best = arr[i];
		}
		for (i = 0; i < n; i++) {
			System.out.print(i + "��ѧ���ɼ�Ϊ" + arr[i] + ",�ȼ�Ϊ");
			if (arr[i] >= best - 10)
				System.out.println('A');
			else if (arr[i] >= best - 20)
				System.out.println('B');
			else if (arr[i] >= best - 30)
				System.out.println('C');
			else if (arr[i] >= best - 40)
				System.out.println('D');
			else
				System.out.println('F');
		}
	}

}
