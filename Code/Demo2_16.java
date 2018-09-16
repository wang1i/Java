package myjava;

import java.util.Scanner;

public class Demo2_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入六边形边长：");
		double s = input.nextDouble();
		
		double area = 3 * Math.pow(3, 0.5) / 2 * Math.pow(s, 2);
		
		System.out.print("六边形边长为：" + area);

	}

}
