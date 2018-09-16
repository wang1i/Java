package myjava;

import java.util.Scanner;

public class Demo3_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入币值（美分）：");
		int amount = input.nextInt();
		
		int numOfOneDollars = amount / 100;
		int numOfOnePennies = amount % 100;
		if(numOfOneDollars <= 1 ) {
			System.out.print(amount + " pennies " +  " is " + numOfOneDollars + " dollar  and  ");
		}
		else {
			System.out.print(amount + " pennies " + " is " + numOfOneDollars + " dollars  and  ");
		}
		if(numOfOnePennies <= 1) {
			System.out.print(amount + " is " + numOfOnePennies + " pennie .");
		}
		else {
			System.out.print(amount + " is " + numOfOnePennies + " pennies .");
		}	
	}

}
