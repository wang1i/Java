package myjava;

import java.util.Scanner;

public class Demo2_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入水的重量(kg): " );
		double quality = input.nextDouble();
		System.out.print("请输入水的初始温度(℃): ");
		double initialTemperature = input.nextDouble();
		System.out.print("请输入水的最终温度(℃): ");
		double finalTemperature = input.nextDouble();
		
		double energy = quality * ( finalTemperature - initialTemperature ) * 4184;
		
		System.out.println("所需能量为：" + energy );

	}

}
