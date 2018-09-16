package myjava;

import java.util.Scanner;

public class Demo4_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入两个点的经纬度（x1，y1）、（x2，y2）(以度为单位)：");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
        
		double r = 6371.01;
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		double d = r * Math.acos((Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
		System.out.println("最大圆距离：" + d +"km");
		
	}

}
