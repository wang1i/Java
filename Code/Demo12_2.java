package myjava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo12_2 {

	public static void main(String[] args) {
		System.out.print("����������������");
		int num1 = 0, num2 = 0;
		try {
			try (Scanner input = new Scanner(System.in);) {
				num1 = input.nextInt();
				num2 = input.nextInt();
			}
			System.out.println("�ͣ�" + (num1 + num2));
		} catch (InputMismatchException ex) {
			System.out.println("������������������");
		}
	}

}
