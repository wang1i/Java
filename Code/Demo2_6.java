package myjava;

import java.util.Scanner;

public class Demo2_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��0~1000֮�������:");
		int number =  input.nextInt();
		int hundred = number / 100;
		number = number / 10;
		int decade = number / 10;
		int digit = number % 10;
		
		System.out.println(hundred + decade + digit);

	}

}
