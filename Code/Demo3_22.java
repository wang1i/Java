package myjava;

import java.util.Scanner;

public class Demo3_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("����������꣨x��y����");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double dist = Math.pow(x * x + y * y, 0.5);
		if(dist <=10)
			System.out.println("�㣨" + x + "," + y + ")����ԭ��ΪԲ�ģ��뾶Ϊ10��Բ��");
		else
			System.out.println("�㣨" + x + "," + y + ")������ԭ��ΪԲ�ģ��뾶Ϊ10��Բ��");

	}

}
