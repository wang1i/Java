package myjava;

import java.util.Scanner;

public class Demo6_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入三个整数：");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		diplaySortedNumbers(num1, num2, num3);
	}

	public static void diplaySortedNumbers(int num1, int num2, int num3) {
		int temp;
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num1 > num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if (num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		System.out.println(num1 + "   " + num2 + "   " + num3);

	}

}
