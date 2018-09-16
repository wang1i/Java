package myjava;

import java.util.Scanner;

public class Demo4_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入正五边形的外切圆的半径：");
		double radius = input.nextDouble();
		double x0 = 0 , y0 = 100;
		
		double x1 = radius * Math.cos(Math.PI * 0.1);
		double y1 = radius * Math.sin(Math.PI * 0.1);
		double x2 = -radius * Math.cos(Math.PI * 0.1);
		double y2 = radius * Math.sin(Math.PI * 0.1);
		double x3 = -radius * Math.cos(Math.PI * 0.3);
		double y3 = -radius * Math.sin(Math.PI * 0.3);
		double x4 = radius * Math.cos(Math.PI * 0.3);
		double y4 = -radius * Math.sin(Math.PI * 0.3);
		
		System.out.println("五个顶点坐标分别为：");
        System.out.println("(" + x0 + "," + y0 + ")");
        System.out.println("(" + x1 + "," + y1 + ")");
        System.out.println("(" + x2 + "," + y2 + ")");
        System.out.println("(" + x3 + "," + y3 + ")");
        System.out.println("(" + x4 + "," + y4 + ")");

	}

}
