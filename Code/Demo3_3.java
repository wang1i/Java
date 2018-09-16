package myjava;

import java.util.Scanner;

public class Demo3_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入a,b,c,d,e,f(ax+by=e,cx+dy=f)：");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		if(Math.abs(a * d - b * c) <=1e-6) {
			System.out.println("方程式无解！");
			System.exit(1);
		}
		else {
			double x = (e * d -b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.println("x=" + x + "      "+ "y=" + y);
		}

	}

}
