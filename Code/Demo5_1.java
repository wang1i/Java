package myjava;

import java.util.Scanner;

public class Demo5_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入若干整数（以0结束）：");
		int countPositive = 0 , countNegative = 0 , digit;
		double sum = 0, average ;
		do {
			digit = input.nextInt();
			sum += digit;
			if(digit > 0)
				countPositive ++;
			if(digit < 0)
				countNegative ++;
		}while(digit !=0);
		average = sum / (countPositive + countNegative);
		System.out.println("正数个数：" + countPositive);	
		System.out.println("负数个数：" + countNegative);
		System.out.println("总和：" + sum + "\n平均值:" + average);

	}

}
