package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月10日下午7:57:55
 * @type 练习题
 */
public class Demo8_15 {

	public static void main(String[] args) {
		// (x1 - x0) * (y2 - y0) - (x2 -x0) * (y1 - y0) == 0 p2 在p0p1上
		Scanner input = new Scanner(System.in);
		System.out.print("输入5个点：");
		double[][] points = new double[5][2];
		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 2; j++)
				points[i][j] = input.nextDouble();
		if (sameLine(points))
			System.out.println("这五个点在同一条直线上");
		else
			System.out.println("这五个点不在同一条直线上");
	}

	private static boolean sameLine(double[][] points) {
		for (int i = 2; i < 5; i++) {
			double t = (points[1][0] - points[0][0]) * (points[i][1] - points[0][1])
					- (points[i][0] - points[0][0]) * (points[1][1] - points[0][1]);
			if (t != 0)
				return false;
		}
		return true;
	}

}
