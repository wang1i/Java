package myjava;

import java.util.Scanner;

public class Demo2_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入英尺数：");
		double feet = input.nextDouble();
		
		double meter = feet / 0.305;
		
		System.out.println(feet + "英尺是" + meter + "米");

	}

}
