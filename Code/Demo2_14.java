package myjava;

import java.util.Scanner;

public class Demo2_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入体重（磅）：");
		double weight = input.nextDouble();
		System.out.print("请输入身高（英尺）：");
		double height = input.nextDouble();
		
		double BMI = ( weight / 0.45359237 ) / Math.pow( height / 0.0254, 2 ) ;
		
		System.out.print( "BMI : " + BMI );

	}

}
