package myjava;

import java.util.Scanner;

public class Demo2_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入美分币值：");
		int amount = input.nextInt();
		
		int numberOfOneDollars = amount / 100;
		int remaining = amount % 100;
		int numberOfQuarters = remaining / 25;
		remaining %= 25;
		int numberOfDimes = remaining /10;
		remaining %= 10;
		int numberOfNickels = remaining / 5;
		int numberOfPennies = remaining % 5;
		
		System.out.println(amount + "美分即为：" +numberOfOneDollars + "dollars  " 
		+ numberOfQuarters +"quarters  " + numberOfDimes + "dimes  " + 
				numberOfNickels + "nickels  " + numberOfPennies +"pennies  ");

	}

}
