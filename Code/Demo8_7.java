package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��9������8:26:15
 * @type ��ϰ��
 */
public class Demo8_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������8����ά�� �� ");
		double[][] points = new double[8][3];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 3; j++)
				points[i][j] = input.nextDouble();
		}
		shortestDistance(points);

	}

	private static void shortestDistance(double[][] points) {
		int p1 = 0, p2 = 1;
		double shortestDistance = distance(points[p1], points[p2]);
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++)
				if (i != j && distance(points[i], points[j]) < shortestDistance) {
					shortestDistance = distance(points[i], points[j]);
					p1 = i;
					p2 = j;
				}
		System.out.print("��̾���Ϊ��" + shortestDistance + "       �˶����ǣ�\n(");
		for (int i = 0; i < 3; i++)
			if (i == 2)
				System.out.print(points[p1][i] + ") , (");
			else
				System.out.print(points[p1][i] + ",");
		for (int i = 0; i < 3; i++)
			if (i == 2)
				System.out.print(points[p2][i] + ")\n");
			else
				System.out.print(points[p2][i] + ",");
	}

	private static double distance(double[] ds1, double[] ds2) {
		double sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += (ds2[i] - ds1[i]) * (ds2[i] - ds1[i]);
		}
		return Math.sqrt(sum);
	}

}
