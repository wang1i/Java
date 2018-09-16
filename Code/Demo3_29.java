package myjava;

import java.util.Scanner;

public class Demo3_29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入圆1的中心坐标（x，y）、半径：");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();
		System.out.print("请输入圆2的中心坐标（x，y）、半径：");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();
		
		double dist = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 -y2, 2), 0.5);
		if(dist <= Math.abs(r1 -r2))
			System.out.println("圆2在圆1内！");
		else if(dist <=Math.abs(r1 + r2))
			System.out.println("圆2与圆1重叠！");
		else
			System.out.println("圆2不与圆1重叠！");

	}

}
