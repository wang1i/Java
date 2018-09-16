package myjava;

import java.util.Scanner;

public class Demo3_33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入包裹1的重量及价格：");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		System.out.print("请输入包裹2的重量及价格：");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		if(price1 / weight1 > price2 / weight2)
			System.out.println("包裹1更实惠");
		else if(price1 / weight1 == price2 / weight2)
			System.out.println("两包裹同样实惠");
		else
			System.out.println("包裹2更实惠");

	}

}
