package myjava;

import java.util.Scanner;

public class Demo2_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������ʻ���룺");
		double distance = input.nextDouble();
		System.out.print("������ÿ���صļ�ʻ���룺");
		double property = input.nextDouble();
		System.out.print("������ÿ���صļ۸�");
		double price = input.nextDouble();
		
		double cost = price * (distance / property);
		
		System.out.println("��ʻ���ã�$" + cost);

	}

}
