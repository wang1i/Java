package myjava;

import java.util.Scanner;

public class Demo3_33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������1���������۸�");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		System.out.print("���������2���������۸�");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		if(price1 / weight1 > price2 / weight2)
			System.out.println("����1��ʵ��");
		else if(price1 / weight1 == price2 / weight2)
			System.out.println("������ͬ��ʵ��");
		else
			System.out.println("����2��ʵ��");

	}

}
