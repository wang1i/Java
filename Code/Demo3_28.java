package myjava;

import java.util.Scanner;

public class Demo3_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������1�����ĵ����꣨x��y�������ο�ȡ����θ߶ȣ�");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		System.out.println("���������2�����ĵ����꣨x��y�������ο�ȡ����θ߶ȣ�");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();
		
		if(Math.abs(x1 - x2) <= width1 - width2 && Math.abs(y1 - y2) <= height1 - height2)
			System.out.println("����2�ھ���1��");
		else if(Math.abs(x1 - x2) < width1 + width2 &&Math.abs(y1 - y2) < height1 + height2)
			System.out.println("����2�����1�ص�");
		else
			System.out.println("����2�������1�ص�");
		

	}

}
