package myjava;

import java.util.Scanner;

public class Demo5_41 {

	public static void main(String[] args) {
		final int N = 6;
		int i, max = 0, count = 0;
		int[] arr = new int[N];
		Scanner input = new Scanner(System.in);
		System.out.print("������" + N + "������(��0����)��");
		for (i = 0; i < N; i++) {
			arr[i] = input.nextInt();
			if (arr[i] == max)
				count++;
			if (arr[i] > max) {
				max = arr[i];
				count = 1;
			}
		}
		System.out.println("�����Ϊ��" + max + "\n��������ִ�����" + count);

	}

}
