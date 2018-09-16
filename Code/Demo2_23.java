package myjava;

import java.util.Scanner;

public class Demo2_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入驾驶距离：");
		double distance = input.nextDouble();
		System.out.print("请输入每加仑的驾驶距离：");
		double property = input.nextDouble();
		System.out.print("请输入每加仑的价格：");
		double price = input.nextDouble();
		
		double cost = price * (distance / property);
		
		System.out.println("驾驶费用：$" + cost);

	}

}
