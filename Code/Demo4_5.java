package myjava;

import java.util.Scanner;

public class Demo4_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������������εı�����");
		double n = input.nextDouble();
		System.out.print("��������" + n + "���εı߳���");
		double s = input.nextDouble();
		
		double area = n * s * s /(4 * Math.tan(Math.PI / n));
		System.out.println("��" + n + "���ε����Ϊ��" + area);

	}

}
