package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��8������12:01:39
 * @type ��ϰ��
 */
public class Demo7_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("����������1���ȣ�");
		int len1 = input.nextInt();
		System.out.print("����������1��");
		int[] list1 = new int[len1];
		for (int i = 0; i < len1; i++)
			list1[i] = input.nextInt();
		System.out.print("����������2���ȣ�");
		int len2 = input.nextInt();
		System.out.print("����������2��");
		int[] list2 = new int[len2];
		for (int i = 0; i < len2; i++)
			list2[i] = input.nextInt();

		int[] list = merge(list1, list2);
		for (int i = 0; i < len1 + len2; i++)
			System.out.print(list[i] + "  ");

	}

	private static int[] merge(int[] list1, int[] list2) {
		int len1 = list1.length, len2 = list2.length;
		int[] res = new int[len1 + len2];
		int i = 0, j = 0, k = 0;
		while (i < len1 && j < len2) {
			if (list1[i] <= list2[j])
				res[k++] = list1[i++];
			else
				res[k++] = list2[j++];
		}
		while (i < len1)
			res[k++] = list1[i++];
		while (j < len2)
			res[k++] = list2[j++];
		return res;
	}

}
