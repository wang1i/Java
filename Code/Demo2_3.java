package myjava;

import java.util.Scanner;

public class Demo2_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������Ӣ������");
		double feet = input.nextDouble();
		
		double meter = feet / 0.305;
		
		System.out.println(feet + "Ӣ����" + meter + "��");

	}

}
