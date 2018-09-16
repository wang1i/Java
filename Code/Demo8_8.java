package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��9������9:11:45
 * @type ��ϰ��
 */
public class Demo8_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������˸���ά�㣺");
		double[][] points = new double[8][2];
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 2; j++)
				points[i][j] = input.nextDouble();
		printShortest(points);

	}

	private static void printShortest(double[][] points) {
		int p1 = 0, p2 = 1;
		double shortestDistance = distance(points[p1], points[p2]);
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (i != j && distance(points[i], points[j]) < shortestDistance) {
					shortestDistance = distance(points[i], points[j]);
					p1 = i;
					p2 = j;
				}
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (i != j && distance(points[i], points[j]) == shortestDistance)
					System.out.println("������������ǣ�(" + points[i][0] + "," + points[i][1] + ") �� (" + points[j][0] + ","
							+ points[j][1] + ")");
		System.out.println("��̾���Ϊ��" + shortestDistance);

	}

	private static double distance(double[] ds1, double[] ds2) {
		double sum = 0;
		for (int i = 0; i < 2; i++) {
			sum += (ds1[i] - ds2[i]) * (ds1[i] - ds2[i]);
		}
		return Math.sqrt(sum);
	}

}
