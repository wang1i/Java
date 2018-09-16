package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��7������11:30:21
 * @type ��ϰ��
 */
public class Demo7_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������г��ȣ�");
		int n = input.nextInt();
		System.out.print("���������У�");
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = input.nextInt();
		if (isConsecutiveFour(a))
			System.out.println("�����������ĸ���ȵ�ֵ");
		else
			System.out.println("����û�������ĸ���ȵ�ֵ");

	}

	private static boolean isConsecutiveFour(int[] a) {
		int key = a[0], count = 0;
		for (int i = 0; i < a.length; i++) {
			if (count == 4)
				return true;
			if (a[i] == key)
				count++;
			else {
				key = a[i];
				count = 1;
			}
		}
		return false;
	}

}
