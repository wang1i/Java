package myjava;

import java.util.Scanner;

public class Demo4_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入正多边形的边数：");
		double n = input.nextDouble();
		System.out.print("请输入正" + n + "边形的边长：");
		double s = input.nextDouble();
		
		double area = n * s * s /(4 * Math.tan(Math.PI / n));
		System.out.println("正" + n + "边形的面积为：" + area);

	}

}
