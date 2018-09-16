package myjava;

import java.util.Scanner;

public class Demo3_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入点坐标（x，y）：");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double dist_x = Math.abs(x);
		double dist_y = Math.abs(y);
		if(dist_x <=10.0 /2 && dist_y<=5.0 / 2)
			System.out.print("点（" + x + "," + y +")在");
		else
			System.out.print("点（" + x + "," + y +")不在");
		System.out.println("以原点为中心，宽为10，高为5的矩形中");

	}

}
