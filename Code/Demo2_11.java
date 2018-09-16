package myjava;

import java.util.Scanner;

public class Demo2_11 {

	public static void main(String[] args) {
		final double populace = 312032486; 
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年数：");
		int years = input.nextInt();
		
		double birth = 365 * 24 * 3600 / 7;
		double die = 365 *24 *3600 / 13;
		double migrate = 365 *24 * 3600 / 45;
		double population = populace + years * ( birth + migrate -die );
		
		System.out.println(years + "年后人口数为：" + population );

	}

}
