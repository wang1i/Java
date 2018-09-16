package myjava;

import java.util.Scanner;

public class Demo3_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入三角形的三条边长：");
		double edge1 = input.nextDouble();
		double edge2 = input.nextDouble();
		double edge3 = input.nextDouble();
		
		if(edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1)
			System.out.println("三角形周长为：" + (edge1 + edge2 + edge3));
		else
			System.out.println("输入值非法！任意两边之和须大于第三边");

	}

}
