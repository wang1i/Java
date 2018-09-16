package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��6������5:04:07
 * @type ��ϰ��
 */
public class Demo7_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������ѧ��������");
		int n = input.nextInt();
		String[] name = new String[n];
		double[] score = new double[n];
		String temp;
		for (int i = 0; i < n; i++) {
			temp = input.nextLine();
			System.out.print("ѧ��" + (i + 1) + ": ���� ");
			name[i] = input.nextLine();
			System.out.print("  �ɼ� ");
			score[i] = input.nextDouble();
		}
		printNameOfDiscending(name, score, n);

	}

	private static void printNameOfDiscending(String[] name, double[] score, int n) {
		int count = n, i, maxi;
		double max;
		while (count > 0) {
			max = -1;
			maxi = -1;
			for (i = 0; i < n; i++)
				if (score[i] > max) {
					max = score[i];
					maxi = i;
				}
			score[maxi] = -2;
			System.out.print(name[maxi] + "     ");
			count--;
		}
	}

}
