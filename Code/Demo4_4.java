package myjava;

import java.util.Scanner;

public class Demo4_4 {

	public static void main(String[] args) {
		Scanner input = 	new Scanner(System.in);
		System.out.print("�����������α߳���");
		double s = input.nextDouble();
		double area = 6 * s * s /(4 * Math.tan(Math.PI / 6));
       System.out.println("���������Ϊ��" + (int)(area * 100) / 100.0);
	}

}
