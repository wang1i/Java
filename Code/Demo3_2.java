package myjava;

import java.util.Scanner;

public class Demo3_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		int num3 = (int)(Math.random() * 10);
		System.out.print("������" + num1 + "+" + num2 + "+" +num3+ "=?��");
		int answer = input.nextInt();
		if(answer == num1 + num2 + num3) {
			System.out.print("ף���㣡�ش���ȷ��");		
		}
		else {
			System.out.print("��Ǹ���ش������ȷ��Ϊ" + (num1 + num2 + num3));
		}
	}

}
