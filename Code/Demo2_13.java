package myjava;

import java.util.Scanner;

public class Demo2_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入每月存钱数：");
		double save = input.nextInt();
		double monthlyRate = 0.05 / 12 ;
		double sum = 0;
		
		for( int i = 1 ; i <= 6 ; i ++) {
			sum = sum + save;
			sum = sum * (1 + monthlyRate)  ;
		}
		System.out.println(sum);
		
	}

}
