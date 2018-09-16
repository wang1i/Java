package myjava;

import java.util.Scanner;

public class Demo3_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入点坐标（x，y）：");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double dist = Math.pow(x * x + y * y, 0.5);
		if(dist <=10)
			System.out.println("点（" + x + "," + y + ")在以原点为圆心，半径为10的圆内");
		else
			System.out.println("点（" + x + "," + y + ")不在以原点为圆心，半径为10的圆内");

	}

}
