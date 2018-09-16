package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��14������7:30:46
 * @type ��ϰ��
 */
public class Demo8_34 {

	public static void main(String[] args) {
		double[][] points = getPoints();
		int p = getRightmostLowestPoint(points);
		System.out.println("���½ǵ��ǣ���" + points[p][0] + "," + points[p][1] + ")");

	}

	private static double[][] getPoints() {
		Scanner input = new Scanner(System.in);
		System.out.print("������6���㣺");
		double[][] a = new double[6][2];
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 2; j++)
				a[i][j] = input.nextDouble();
		return a;
	}

	private static int getRightmostLowestPoint(double[][] points) {
		double max = 0, d;
		int p = 0;
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 2; j++) {
				d = Math.abs(points[i][0] - points[i][1]) / Math.sqrt(2);
				if (d > max) {
					max = d;
					p = i;
				}
			}
		return p;
	}

}
