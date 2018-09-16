package myjava;

import java.util.Scanner;

public class Demo3_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int num = input.nextInt();
		
		if(num % 5 == 0 || num % 6 == 0)
			System.out.println(num + "能被5或6整除？ 正确");
		else
			System.out.println(num + "能被5或6整除？ 错误");
		
		if(num % 5 == 0 && num % 6 == 0)
			System.out.println(num + "能被5和6整除？ 正确");
		else {
			System.out.println(num + "能被5和6整除？ 错误");
			if(num % 5 == 0 || num % 6 == 0)
				System.out.println(num + "能被5或6整除但不是同时？ 正确");
			else
				System.out.println(num + "能被5或6整除但不是同时？ 错误");
		}
		

	}

}
