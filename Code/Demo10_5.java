package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��14������10:02:51
 * @type ��ϰ��
 */
public class Demo10_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("��������������");
		int value = input.nextInt();
		StackOfInteger f = new StackOfInteger(value);
		int n = f.getTop();
		int[] a = f.getFactor();
		for (int i = n - 1; i > 0; i--)
			System.out.print(a[i] + "��");
		System.out.println(a[0]);
	}

}
