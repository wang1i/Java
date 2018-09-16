package myjava;

import java.util.Scanner;

public class Demo2_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入速度（m/s）、加速度（m/s∧2）：");
		double v = input.nextDouble();
		double a = input.nextDouble();
		
		double s = v * v / ( 2 * a );
		
		System.out.println("最短跑道长度为：" + s );

	}

}
