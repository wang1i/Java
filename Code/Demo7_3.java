package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��4������6:08:55
 * @type ��ϰ��
 */
public class Demo7_3 {

	public static void main(String[] args) {
		int i;
		int[] a = new int[10], b = new int[101];
		for (i = 0; i <= 100; i++)
			b[i] = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("������10��1~100֮���������");
		for (i = 0; i < 10; i++) {
			a[i] = input.nextInt();
			b[a[i]]++;
		}
		for (i = 1; i <= 100; i++) {
			if (b[i] != 0)
				System.out.println(i + "����" + b[i] + "��");
		}
	}

}
