package myjava;

import java.util.Scanner;

public class Demo5_38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��ʮ��������");
		int num = input.nextInt();
		int[] array = new int[20];
		int i = 0, j;
		if (num == 0) {
			System.out.println("��Ӧ�İ˽�����Ϊ��" + num);
			System.exit(1);
		}
		while (num > 0) {
			array[i++] = num % 8;
			num = num / 8;
		}
		System.out.print("��Ӧ�İ˽�����Ϊ��");
		for (j = i - 1; j >= 0; j--)
			System.out.print(array[j]);

	}

}
