package myjava;

import java.util.Scanner;

public class Demo3_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入体重（磅），身高（英尺值），身高（英寸值）：");
		double weight = input.nextDouble();
		double highFeets = input.nextDouble();
		double highInches = input.nextDouble();
		
		double BMI = (weight * 0.45359237) / Math.pow((highFeets * 12 + highInches) * 0.0254, 2);
		
		System.out.println("BMI=" + BMI);

	}

}
