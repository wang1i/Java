package myjava;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��13������7:12:30
 * @type ��ϰ��
 */
public class Demo8_26 {

	public static void main(String[] args) {
		double[][] a = getArray();
		for (int i = 0; i < 3; i++)
			Arrays.sort(a[i]);
		System.out.println("����������ǣ�");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(a[i][j] + "  ");
			System.out.println();
		}
	}

	private static double[][] getArray() {
		Scanner input = new Scanner(System.in);
		System.out.println("������3*3����");
		double[][] a = new double[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				a[i][j] = input.nextDouble();
		return a;
	}

}
