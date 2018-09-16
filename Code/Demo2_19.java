package myjava;

import java.util.Scanner;

public class Demo2_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入三角形的三个点的坐标（依次为x1,y1,x2,y2,x3,y3 )：");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double edge1 = Math.pow(Math.pow(y2-y1, 2) + Math.pow(x2-x1, 2) ,0.5);
		double edge2 = Math.pow(Math.pow(y3-y1, 2) + Math.pow(x3-x1, 2) ,0.5);
		double edge3 = Math.pow(Math.pow(y3-y2, 2) + Math.pow(x3-x2, 2) ,0.5);
		double p = (edge1 + edge2 + edge3) / 2 ;
		double area = Math.pow(p * (p - edge1) * (p - edge2) * (p - edge3), 0.5) ;
		
		System.out.println("三角形面积为：" + area);

	}

}
