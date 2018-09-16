package myjava;

import java.util.Scanner;

public class Demo2_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入室外温度（温度在-58°F和41°F之间)：");
		double t_a = input.nextDouble();
		System.out.println();
		System.out.print("请输入风速（不低于2mph）：");
		double v = input.nextDouble();
		System.out.println();
		
		double t_wc = 35.74 + 0.6215 * t_a -35.75 * Math.pow(v, 0.16) + 0.4275 * t_a *Math.pow(v, 0.16);
		
		System.out.println("风寒温度为：" + t_wc);
		
	}

}
