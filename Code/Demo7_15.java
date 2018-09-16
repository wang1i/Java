package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��6������4:41:39
 * @type ��ϰ��
 */
public class Demo7_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������10��������");
		int[] list = new int[10], arr = new int[10];
		int i;
		for (i = 0; i < 10; i++)
			list[i] = input.nextInt();
		arr = eliminateDuplicates(list);
		for (i = 0; i < 10; i++)
			if (arr[i] != 0)
				System.out.print(arr[i] + "  ");

	}

	private static int[] eliminateDuplicates(int[] list) {
		int[] a = new int[10];
		int i, j;
		a[0] = list[0];
		for (i = 1; i < 10; i++) {
			for (j = 0; j < i; j++)
				if (list[i] == a[j])
					break;
			if (j >= i)
				a[j] = list[i];
		}
		return a;
	}

}
