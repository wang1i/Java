package myjava;

import java.util.Scanner;

public class Demo2_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入磅数：");
		double pounds = input.nextDouble();
		
		double kilograms = pounds * 0.454;
		
		System.out.println(pounds + "磅是" + kilograms +"千克");

	}

}
