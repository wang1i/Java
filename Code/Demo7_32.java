package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��8������12:18:39
 * @type ��ϰ��
 */
public class Demo7_32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������鳤�ȣ�");
		int len = input.nextInt();
		System.out.print("���������飺");
		int[] a = new int[len];
		for (int i = 0; i < len; i++)
			a[i] = input.nextInt();
		int index = partition(a);
		for (int i = 0; i < len; i++)
			System.out.print(a[i] + " \t");
		System.out.println("���ĵ��ڵ�" + (index + 1) + "��");

	}

	private static int partition(int[] a) {
		int pivot = a[0];
		int low = 0, high = a.length - 1;
		while (low < high) {
			while (low < high && a[high] >= pivot)
				high--;
			a[low] = a[high];
			while (low < high && a[low] <= pivot)
				low++;
			a[high] = a[low];
		}
		a[low] = pivot;
		return low;
	}

}
