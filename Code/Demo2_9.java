package myjava;

import java.util.Scanner;

public class Demo2_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入速度1(m/s)、速度2(m/s)、时间(s): ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		double a = ( v1 - v0 ) / t;
		
		System.out.println("加速度为：" + a );

	}

}
