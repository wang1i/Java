package myjava;

import java.util.Scanner;

public class Demo3_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("��²����򷴣�0��ʾ���棬1��ʾ���棩��");
		int guess = input.nextInt();
		int coin = (int)(Math.random() * 10);
		coin = coin / 5;
		if(guess == coin) {
			System.out.print("�¶��ˣ�");
		}
		else {
			System.out.print("�´��ˣ�");
		}
	}

}
