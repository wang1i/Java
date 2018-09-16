package myjava;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月13日下午10:19:57
 * @type 练习题
 */
public class Demo8_30 {

	public static void main(String[] args) {
		double[][] points = getPoints();
		printAreaInOrder(points);
	}

	private static void printAreaInOrder(double[][] points) {
		double[] a = new double[4];
		a[0] = area(points, 0, 1, 2);
		a[1] = area(points, 0, 1, 3);
		a[2] = area(points, 0, 2, 3);
		a[3] = area(points, 1, 2, 3);
		Arrays.sort(a);
		System.out.println("四个三角形面积由小到大是：");
		for (int i = 0; i < 4; i++)
			System.out.print(a[i] + "  ");

	}

	private static double area(double[][] points, int i, int j, int k) {
		double d = (points[i][0] - points[j][0]) * (points[k][1] - points[j][1])
				- (points[k][0] - points[j][0]) * (points[i][1] - points[j][1]);
		if (d == 0)
			return 0;
		double a = dist(points, i, j);
		double b = dist(points, i, k);
		double c = dist(points, j, k);
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	private static double dist(double[][] points, int i, int j) {
		double d = (points[i][0] - points[j][0]) * (points[i][0] - points[j][0])
				+ (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);
		return Math.sqrt(d);
	}

	private static double[][] getPoints() {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入四个顶点坐标：");
		double[][] points = new double[4][2];
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 2; j++)
				points[i][j] = input.nextDouble();
		return points;
	}

}
