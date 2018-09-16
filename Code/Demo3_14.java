package myjava;

import java.util.Scanner;

public class Demo3_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请猜测正或反（0表示正面，1表示反面）：");
		int guess = input.nextInt();
		int coin = (int)(Math.random() * 10);
		coin = coin / 5;
		if(guess == coin) {
			System.out.print("猜对了！");
		}
		else {
			System.out.print("猜错了！");
		}
	}

}
