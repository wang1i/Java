package myjava;

import java.util.Scanner;

public class Demo3_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请依次输入直线1的两个点（x1，y1）和（x2，y2）、直线2的两个点（x3，y3）和（x4，y4）：");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		double a = y1 - y2;
		double b = x2 - x1;
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double c = y3 - y4;
		double d = x4 - x3;
		double f  = (y3 - y4) * x3 - (x3 - x4) * y3;
		if(Math.abs(a * d - b * c) <=1e-6) {
			System.out.println("直线1与直线2平行");
			System.exit(1);
		}
		else {
			double x = (e * d -b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.println("交点为：（" + x + "，" + y + ")");
		}
	}

}
