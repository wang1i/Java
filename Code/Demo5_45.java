package myjava;

import java.util.Scanner;

public class Demo5_45 {

	public static void main(String[] args) {
		double[] arr = new double[10];
		double sum = 0, squar = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("������10�����֣�");
		for (int i = 0; i < 10; i++) {
			arr[i] = input.nextDouble();
			sum += arr[i];
			squar += Math.pow(arr[i], 2);
		}
		double aver = sum / 10;
		double var = Math.pow((squar - sum * sum / 10) / 9, 0.5);
		System.out.println("ƽ��ֵ��" + aver + "\n���" + var);

	}

}
