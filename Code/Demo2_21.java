package myjava;

import java.util.Scanner;

public class Demo2_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������Ͷ�ʽ�");
		double investment = input.nextDouble();
		System.out.println();
		System.out.print("�����������ʣ�����3������3%����");
		double yearRate = input.nextDouble();
		System.out.println();
		System.out.print("������������");
		double year = input.nextDouble();
		
		double futureValue = investment * Math.pow(1+yearRate/1200, year *12);
		
		System.out.println("δ��Ͷ�ʽ��Ϊ��" + futureValue);
		

	}

}
