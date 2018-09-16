package myjava;

import java.util.Scanner;

public class Demo3_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入点（x，y）坐标：");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		if(x >= 200 || y >=100) {
			System.out.println("点（" + x +"," + y + ")不在该三角形内");
			System.exit(1);
		}
		else {                   //y = -0.5x + 100
			if(y < 100 - 0.5 * x)
				System.out.println("点（" + x +"," + y + ")在该三角形内");
			else
				System.out.println("点（" + x +"," + y + ")不在该三角形内");
		}

	}

}
