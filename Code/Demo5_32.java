package myjava;

import java.util.Scanner;

public class Demo5_32 {

	public static void main(String[] args) {
		int lottery , digit , lottery1 , lottery2 , digit1 , digit2;
		do {
			lottery = (int)(Math.random() * 100);
			lottery1 = lottery / 10;
			lottery2 = lottery % 10;
		}while(lottery1 != lottery2);
		System.out.println(lottery);
		Scanner input =new Scanner(System.in);
		System.out.print("请输入一个两位的正整数：");
		digit = input.nextInt();
		digit1 = digit / 10;
		digit2 = digit % 10;
		
		if(digit == lottery)
			System.out.println("一等奖10000$");
		else if(digit1 == lottery2 && digit2 == lottery1)
			System.out.println("二等奖3000$");
		else if(digit1 == lottery1 || digit2 == lottery2 || digit1 == lottery2 || digit2 == lottery1)
			System.out.println("三等奖1000$");
		else
			System.out.println("谢谢惠顾");

	}

}
