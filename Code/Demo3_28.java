package myjava;

import java.util.Scanner;

public class Demo3_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入矩形1的中心点坐标（x，y）、矩形宽度、矩形高度：");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		System.out.println("请输入矩形2的中心点坐标（x，y）、矩形宽度、矩形高度：");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();
		
		if(Math.abs(x1 - x2) <= width1 - width2 && Math.abs(y1 - y2) <= height1 - height2)
			System.out.println("矩形2在矩形1内");
		else if(Math.abs(x1 - x2) < width1 + width2 &&Math.abs(y1 - y2) < height1 + height2)
			System.out.println("矩形2与矩形1重叠");
		else
			System.out.println("矩形2不与矩形1重叠");
		

	}

}
