package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��4������5:52:20
 * @type ��ϰ��
 */
public class Demo7_2 {

	public static void main(String[] args) {
		int i;
		int[] a = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.print("������10��������");
		for (i = 0; i < 10; i++)
			a[i] = input.nextInt();
		for (i = 9; i >= 0; i--)
			System.out.print(a[i] + " ");

	}

}
