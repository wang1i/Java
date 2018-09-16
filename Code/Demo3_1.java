package myjava;

import java.util.Scanner;

public class Demo3_1 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.print("请输入a,b,c的值（ax^2+bx+c=0）:");
		 double a = input.nextDouble();
		 double b = input.nextDouble();
		 double c = input.nextDouble();
		 
		double dist = b * b - 4 * a * c;
		if(dist < 0) {
			System.out.println("此方程无实根");
			System.exit(1);
		}
		else if (Math.abs(Math.pow(dist,0.5)) <=1e-6) {
			double r = -b / (2 * a);
			System.out.println("此方程有两个相等的实根：" + r );
		}
		else {
			double r1 = (-b + Math.pow(dist,0.5) ) / (2 * a);
			double r2 = (-b - Math.pow(dist, 0.5) ) / (2 * a);
			System.out.println("此方程有两个不等的实根：" + r1 + "和" + r2);
		}
	}

}
