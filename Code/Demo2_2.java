package myjava;

import java.util.Scanner;

public class Demo2_2 {

	public static void main(String[] args) {
		final double PI = 3.14159;
		Scanner input = new Scanner(System.in);
		System.out.print("��ֱ�����Բ����İ뾶��ߣ�");
		double radius = input.nextDouble();
		double high = input.nextDouble();
		
		double area = radius * radius * PI ;
		double volume = area * high ;
		
		System.out.println("Բ����������" + area  + "  �����" +  volume);

	}

}
