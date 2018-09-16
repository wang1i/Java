package myjava;

import java.util.Scanner;

public class Demo2_2 {

	public static void main(String[] args) {
		final double PI = 3.14159;
		Scanner input = new Scanner(System.in);
		System.out.print("请分别输入圆柱体的半径与高：");
		double radius = input.nextDouble();
		double high = input.nextDouble();
		
		double area = radius * radius * PI ;
		double volume = area * high ;
		
		System.out.println("圆柱体的面积：" + area  + "  体积：" +  volume);

	}

}
