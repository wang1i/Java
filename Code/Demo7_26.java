package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��7������9:22:23
 * @type ��ϰ��
 */
public class Demo7_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ���������ĸ�����");
		int len1 = input.nextInt();
		System.out.print("�������һ�����У�");
		int[] list1 = new int[len1];
		for (int i = 0; i < len1; i++)
			list1[i] = input.nextInt();
		System.out.print("\n������ڶ����������ĸ�����");
		int len2 = input.nextInt();
		System.out.print("������ڶ������У�");
		int[] list2 = new int[len2];
		for (int i = 0; i < len2; i++)
			list2[i] = input.nextInt();
		if (equals(list1, list2))
			System.out.println("����1������2��ͬ");
		else
			System.out.println("����1������2��ͬ");

	}

	private static boolean equals(int[] list1, int[] list2) {
		if (list1.length != list2.length)
			return false;
		int i, j;
		int[] flag = new int[list1.length];
		for (j = 0; j < list1.length; j++)
			for (i = 0; i < list1.length; i++) {
				if (list2[j] == list1[i] && flag[i] == 0)
					flag[i] = 1;
				else
					break;
			}
		if (j >= list1.length)
			return true;
		else
			return false;

	}

}
