package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月12日下午7:36:58
 * @type 练习题
 */
public class Demo8_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入城市数目：");
		int n = input.nextInt();
		System.out.println("请输入城市坐标：");
		double[][] citys = new double[n][2];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < 2; j++)
				citys[i][j] = input.nextDouble();
		double[][] distances = new double[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				distances[i][j] = dist(citys[i], citys[j]);
		double sum, shortest = 62670;
		int p = 0;
		for (int i = 0; i < n; i++) {
			sum = 0;
			for (int j = 0; j < n; j++)
				sum += distances[i][j];
			if (sum < shortest) {
				shortest = sum;
				p = i;
			}
		}
		System.out.println("中心城市是：（" + citys[p][0] + "," + citys[p][1] + "）");
		System.out.println("最短距离是：" + shortest);

	}

	private static double dist(double[] ds1, double[] ds2) {
		double d = Math.sqrt((ds1[0] - ds2[0]) * (ds1[0] - ds2[0]) + (ds1[1] - ds2[1]) * (ds1[1] - ds2[1]));
		return d;
	}

}
