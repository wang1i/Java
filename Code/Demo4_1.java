package myjava;

import java.util.Scanner;

public class Demo4_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("����������ε����ĵ�����ľ��룺");
		double r = input.nextDouble();
		double s = 2 * r * Math.sin(Math.PI / 5);
		double area = 5 * s * s / (4 * Math.tan(Math.PI / 5) );
		System.out.println("����������" + (int)(area * 100) / 100.0);

	}

}
